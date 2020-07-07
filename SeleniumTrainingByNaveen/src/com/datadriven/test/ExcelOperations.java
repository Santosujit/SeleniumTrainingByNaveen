package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		//get the data from Excel
		Xls_Reader reader = new Xls_Reader("C:\\Eclipse\\SeleniumTrainingByNaveen\\src\\com\\excel\\utility\\Xls_Reader.java");
		
		reader.addSheet("HomePage");//why it is not working
		
		//If exists , then it will not add the sheet
		
		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
		}

		int colCount= reader.getColumnCount("RegTestData");
		System.out.println(colCount);
		
		int rowNumber=reader.getCellRowNum("RegTestData", "firstname", "santosh");
		System.out.println(rowNumber);
	}

}
