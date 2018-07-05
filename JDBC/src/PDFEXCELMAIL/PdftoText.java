package PDFEXCELMAIL;

import java.io.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.*;
public class PdftoText {

	public static void main(String[] args)throws Exception {
		FileWriter fout=new FileWriter("E:\\Demo10.txt");
		BufferedWriter bout=new BufferedWriter(fout);
		PdfReader re=new PdfReader("E:\\text2pdf1.pdf");
		int x=re.getNumberOfPages();
		int y=1;
		while(x>=1) {
		String str=PdfTextExtractor.getTextFromPage(re, y);
		bout.write(str);
		System.out.println(str);
		x--;
		y++;
		}
		bout.close();
		re.close();
	}

}
