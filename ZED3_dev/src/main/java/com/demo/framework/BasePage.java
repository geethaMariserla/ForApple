package com.demo.framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	protected WebDriver driver;
	//extra
	public String dataFilePath="C:\\hackthon\\ZED3Sheets\\zed3data.xls";
	public static String sheetName = "Sheet1";
	public static File file;
	public static Workbook wb;
	public static Sheet ws;
	public static int testNameRowIndex;
	
	ZED3ExcelOperations excelOp=new ZED3ExcelOperations();
	
	public void getScreenshot(String methodName) throws IOException{
		System.out.println("here im");
		Date date=new Date();
		SimpleDateFormat dtFormat=new SimpleDateFormat("MMMddYYYYhhmmss");
		String timesnap=dtFormat.format(date);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\hackthon\\screenshots\\"+methodName+timesnap+".jpeg"));
		
	}
	
	public String generateTimeStamp(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MMMddYYYYhhmmss");
		return sdf.format(date);
	}
	
	//extra
	public void setTestNameRow(String testName) throws Exception {
		file = new File(dataFilePath);
		wb = Workbook.getWorkbook(file);
		ws=wb.getSheet(sheetName);
		
		testNameRowIndex=excelOp.getTestCaseRowIndex(testName);  //to be called from jar later
		
	}
	
	public String getTestData(String colName) throws BiffException, IOException{
		
		return excelOp.getData(colName);                     //to be called from jar later
		
       
	}
	/*public void putSomeData(String... seq) throws RowsExceededException, WriteException, IOException{
		excelOp.putData(String... seqq);
	}*/
	
	
	
	
	
	
	
	
}
