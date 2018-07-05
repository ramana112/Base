package PDFEXCELMAIL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Pdfcreate {
 
    public static final String TEXT
        = "E:\\Cool\\Dummy.txt";
    public static final String DEST
        = "E:\\Cool\\text2pdf.pdf";
 
    public static void main(String[] args)
    	throws Exception {
       
    	Input obj=new Input();
    		obj.createPdf(DEST);
    }
 
    public void createPdf(String dest)
    		throws Exception {
        Document document = new Document();
       //PdfWriter pw=new PdfWriter(document,fout);
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        BufferedReader br = new BufferedReader(new FileReader(TEXT));
        String line;
        Paragraph p;
        Font normal = new Font(FontFamily.TIMES_ROMAN, 12);
        Font bold = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        boolean title = true;
        while ((line = br.readLine()) != null) {
            p = new Paragraph(line, title ? bold : normal);
            p.setAlignment(Element.ALIGN_JUSTIFIED);
            title = line.isEmpty();//To give rest of code as Normal
            document.add(p);
        }
        document.close();
    }
}
