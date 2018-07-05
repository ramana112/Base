package PDFEXCELMAIL;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFile
{
public static void main(String[] args) throws IOException{
    ArrayList arr=new ArrayList();
File f=new File("E:\\Dox.txt");

Scanner in=new Scanner(f);
System.out.println("Read Data From The Txt file ");
while(in.hasNext())
{    

arr.add(in.nextLine());
}
System.out.println("Data From ArrayList");
System.out.println(arr);


System.out.println("Write data to an Excel Sheet");
FileOutputStream fos=new FileOutputStream("E:\\Dd.xls");
HSSFWorkbook workBook = new HSSFWorkbook();
HSSFSheet spreadSheet = workBook.createSheet("email");
HSSFRow row;
HSSFCell cell;
for(int i=0;i<arr.size();i++){
    row = spreadSheet.createRow((short) i);
cell = row.createCell(i);
System.out.println(arr.get(i));
cell.setCellValue(arr.get(i).toString());
}
System.out.println("Done");
workBook.write(fos);
arr.clear();
System.out.println("ReadIng From Excel Sheet");

FileInputStream fis = null;
    fis = new FileInputStream("D:\\RAKESH\\Lohi\\Stream\\xl.xls");

    HSSFWorkbook workbook = new HSSFWorkbook(fis);
    HSSFSheet sheet = workbook.getSheetAt(0);
    Iterator rows = sheet.rowIterator();

    while (rows.hasNext()) {
        HSSFRow row1 = (HSSFRow) rows.next();
        Iterator cells = row1.cellIterator();
        while (cells.hasNext()) {
            HSSFCell cell1 = (HSSFCell) cells.next();
            arr.add(cell1);
        }
}
System.out.println(arr);

}}