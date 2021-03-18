package poc;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.util.Date;

import java.util.TimeZone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFCode {
	public static Document document;
	public PdfPTable pt;
	public PdfPTable pt1;
	public PdfPTable pt2;
	public List l=new List(); 
	
	String pdfName=this.getClass().getSimpleName();
@BeforeMethod
public void before1() throws FileNotFoundException, DocumentException, InterruptedException
{
	
	 document=new Document();
	PdfWriter.getInstance(document,new FileOutputStream("./"+pdfName+"Report.pdf"));
	document.open();
	Paragraph p=new Paragraph("AUTOMATION REPORT MDM E360",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.UNDERLINE,BaseColor.RED));
	p.setAlignment(Element.ALIGN_CENTER);
	document.add(p);
	Paragraph date=new Paragraph(new Date().toString(),FontFactory.getFont(FontFactory.HELVETICA,12,Font.BOLD,BaseColor.MAGENTA));
	date.setAlignment(Element.ALIGN_CENTER);
	document.add(date);
	pt=new PdfPTable(2);
	pt.addCell("TimeZone");
	pt.addCell(TimeZone.getDefault().getDisplayName());
	pt.addCell("LocalTimeZone");
	pt.addCell(TimeZone.getDefault().getID());
	pt.addCell("Execution Start Time");
	pt.addCell(new Date().toString());
	
	Thread.sleep(5000);
	
	
	
}
@AfterMethod
public void after1() throws DocumentException
{
	pt.addCell("Execution End Time");
	pt.addCell(new Date().toString());
	document.add(new Paragraph(" "));
	document.add(pt);
	document.add(new Paragraph(" "));
	pt1=new PdfPTable(2);
	pt1.addCell("Test Case Name");
	pt1.addCell(this.getClass().getSimpleName());
	pt1.addCell("Test Case Status");
	pt1.addCell("Pass");
	
	document.add(pt1);
	document.add(new Paragraph(" "));
	pt2=new PdfPTable(2);
	PdfPCell cell=new PdfPCell(new Paragraph("Overall Status"));
	PdfPCell cell1=new PdfPCell(new Paragraph("Passed"));
	cell1.setColspan(4);
	cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
	cell1.setBackgroundColor(BaseColor.GREEN);
	
	pt2.addCell(cell);
	pt2.addCell(cell1);
	document.add(pt2);
	document.add(new Paragraph(" "));
	document.add(new Paragraph(" "));
	document.add(new Paragraph(" "));
	document.add(new Paragraph(" "));
	Paragraph end=new Paragraph(new Paragraph("-----------------------------End Of Report------------------------ "));
	end.setAlignment(Element.ALIGN_CENTER);
	document.add(end);
	
	//document.add(l);
	document.add(l);
	document.close();
}

}
