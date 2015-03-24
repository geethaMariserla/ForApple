package com.demo.framework;

import java.io.IOException;

import org.junit.Test;

import jxl.Cell;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ZED3ExcelOperations {
	
	public int getTestCaseRowIndex(String testCaseName){
		int i;
		Cell rows[]=BasePage.ws.getColumn(0); //BasePage.
		for(i=1;i<=rows.length;i++){
			if(rows[i].getContents().equalsIgnoreCase(testCaseName)){
				break;
			}
		}
		return i;
		
	}

	public String getData(String columnName){
            int j;    
		
		Cell[] cols=BasePage.ws.getRow(0);  //BasePage.
		
        for(j=0;j<cols.length;j++){
        	if(cols[j].getContents().equalsIgnoreCase(columnName)){
        		break;
        	}
        	
        }
        
       
        return BasePage.ws.getCell(j, BasePage.testNameRowIndex).getContents();  
	}
	
	/*
	public void putData(String... args) throws IOException, RowsExceededException, WriteException{
		int i,j;
		WritableWorkbook copyWb=Workbook.createWorkbook(BasePage.file, BasePage.wb);
		WritableSheet sheet=copyWb.getSheet(BasePage.sheetName);
		Cell[] cols=BasePage.ws.getRow(0); 
		
		for(i=0;i<args.length;i=i+2){
			
			for(j=0;j<cols.length;j++){
	        	if(cols[j].getContents().equalsIgnoreCase(args[i])){
	        		break;
	        	}
			
		}
			
			Label data=new Label(j,BasePage.testNameRowIndex,args[i+1]);
			sheet.addCell(data);
			copyWb.write();
			copyWb.close();
		
	}
	
	}
	
	
	public  void dummy(String... strings){
		System.out.println(strings.length);
		for(int i=0;i<strings.length;i=i+2){
			System.out.println("key is "+strings[i]);
			System.out.println("value is "+strings[i+1]);
		}
	}
	
	@Test
	public void hi(){
		dummy("one","two","three","four","five","six");
	}
	*/
	
}
