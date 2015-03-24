package com.demo.framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataSheet {

	public String email;
	public String password;
	public String ConfirmPassword;
	public String bilName;
	public String bilPincode;
	public String bilAddress;
	public String bilPhone;
	public String firstName;
	public String lastName;
	
	public void fillSignupdata() throws BiffException, IOException{
		Workbook workbook = Workbook.getWorkbook(new File("C:\\hackthon\\externalData\\hacksheet.xls")); 
		Sheet sheet=workbook.getSheet(0);
		Cell row[]=sheet.getRow(0);
		
		  for(int i=0;i<row.length;i++){
			 if(row[i].getContents().equalsIgnoreCase("EmailId")){
				 email=sheet.getCell(i,1 ).getContents();
				
			 }
			 if(email.length()==0){
				 Date date=new Date();
				 SimpleDateFormat dtFormat= new SimpleDateFormat("MMMddYYYYhhmmss");
				 email=dtFormat.format(date)+"@testflip.com";
				 System.out.println("mail ID is:"+email);
			 }
		  }
			 
			 for(int j=0;j<row.length;j++){
				 if(row[j].getContents().equalsIgnoreCase("Password")){
					 password=sheet.getCell(j,1 ).getContents();
					  
				
				 }
			 }
			
			 for(int k=0;k<row.length;k++){
				 if(row[k].getContents().equalsIgnoreCase("FirstName")){
					 firstName=sheet.getCell(k,1 ).getContents();
					  
				
				 }
			 }
			
			 for(int j=0;j<row.length;j++){
				 if(row[j].getContents().equalsIgnoreCase("LastName")){
					 lastName=sheet.getCell(j,1 ).getContents();
					  
				
				 }
			 }
			  for(int k=0;k<row.length;k++){
					 if(row[k].getContents().equalsIgnoreCase("ConfirmPassword")){
						 ConfirmPassword=sheet.getCell(k,1 ).getContents();
									
					 }
		  }
	}
	
	public void fillBillingAddress() throws BiffException, IOException{
		Workbook workbook = Workbook.getWorkbook(new File("C:\\hackthon\\externalData\\hacksheet.xls")); 
		Sheet sheet=workbook.getSheet(0);
		Cell row[]=sheet.getRow(0);
		
		  for(int i=0;i<row.length;i++){
			 if(row[i].getContents().equalsIgnoreCase("BillName")){
				 bilName=sheet.getCell(i,1 ).getContents();
				
			 }
			 
		  }
			 
			 for(int j=0;j<row.length;j++){
				 if(row[j].getContents().equalsIgnoreCase("BillPinCode")){
					 bilPincode=sheet.getCell(j,1 ).getContents();
					  
				
				 }
			 }
				 for(int k=0;k<row.length;k++){
					 if(row[k].getContents().equalsIgnoreCase("BillAddress")){
						 bilAddress=sheet.getCell(k,1 ).getContents();
						  
					
					 }
		  }
				 for(int l=0;l<row.length;l++){
					 if(row[l].getContents().equalsIgnoreCase("BillPhone")){
						 bilPhone=sheet.getCell(l,1 ).getContents();
						  
					
					 }
		  }
	}
}
