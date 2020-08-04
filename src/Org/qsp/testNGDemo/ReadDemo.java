package Org.qsp.testNGDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class  ReadDemo {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream(".\\Readdata.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet("Sheet1");
		Row firstrow=s.getRow(0);
		
		int Rowcount=s.getPhysicalNumberOfRows();
		for(int i=0;i<Rowcount;i++)
		{
			for(int j=0;j<firstrow.getLastCellNum();j++)
			{
				Cell c1=s.getRow(i).getCell(j);
				System.out.print(c1+"   \t");
			}
			System.out.println();
		}		
	}
}









