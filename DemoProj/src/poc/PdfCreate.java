package poc;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import org.apache.poi.hwpf.usermodel.Table;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Font.FontStyle;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCreate {
	
	public String name=this.getClass().getSimpleName();
	public  void pdfReader() throws DocumentException, MalformedURLException, IOException
	{
		String a="TESTCASE1";
		Document doc=new Document();
		PdfWriter.getInstance(doc,new FileOutputStream("./"+a+"Report.pdf"));
		doc.open();
		
		//Image image=Image.getInstance("C:\\Users\\axr61927\\OneDrive - GSK\\Documents\\Capture.PNG");
		//doc.add(Image.getInstance("C:\\Users\\axr61927\\OneDrive - GSK\\Documents\\Capture.PNG"));
		//doc.add(new Paragraph("Hello india"));
		
		//font bigger and color change
		Paragraph p=new Paragraph("AUTOMATION REPORT MDM E360",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.UNDERLINE,BaseColor.RED));
		p.setAlignment(Element.ALIGN_CENTER);
		doc.add(p);
		/*Paragraph p=new Paragraph("USE",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.UNDERLINE,BaseColor.RED));
		
		p.setAlignment(Element.ALIGN_CENTER);
		
		
		doc.add(p);*/
		//doc.add(new Paragraph("Automation"));
		//doc.add(new Paragraph("----------------------------------------------------------------------------"));
		//Date Show
		Paragraph date=new Paragraph(new Date().toString(),FontFactory.getFont(FontFactory.HELVETICA,12,Font.BOLD,BaseColor.MAGENTA));
		date.setAlignment(Element.ALIGN_CENTER);
     doc.add(date);
		doc.add(new Paragraph("                      "));
		//Table
		
		PdfPTable pt=new PdfPTable(2);
		PdfPCell cell=new PdfPCell(new Paragraph("Testcase Execution Status"));
		PdfPCell cell1=new PdfPCell(new Paragraph("Test Case Name"));
		
		cell.setColspan(4);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setBackgroundColor(BaseColor.GREEN);
		
		//cell1.addElement(new Paragraph("Test Case Name"));
		cell1.setColspan(4);
		cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell1.setBackgroundColor(BaseColor.ORANGE);
		pt.addCell(cell1);
		pt.addCell(cell);
		pt.addCell("TestCase Name");
		pt.addCell("Status");
		pt.addCell("abc");
		pt.addCell("abdf");
		List str=new List();
		str.add("abc");
		str.add("ads");
		str.add("qws");
		doc.add(str);
		
		pt.addCell(name);
		pt.addCell("Pass");
		doc.add(pt);
		doc.add(new Paragraph("1. WebBrowser Started"));
		doc.add(new Paragraph("2. Home Page Displayed"));
		doc.add(new Paragraph("3. All Details Provided"));
		doc.add(new Paragraph("abc"+this.getClass().getSimpleName()));
		System.out.println(TimeZone.getDefault().getID());
		System.out.println(TimeZone.getDefault().getDisplayName());
		
		//TableT
		float column[]= {200f,200f,200f};
		
		
		doc.close();
		
		
	}
   //public static ArrayList<String> str=new ArrayList<String>();
	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		PdfCreate pc=new PdfCreate();
		pc.pdfReader();
		

	}

}

