package com.Actitime.Generic;

import java.io.IOException;

public class Demo_UseOf_Generic {
public static void main(String[] args) throws IOException {
fileLib f=new fileLib();
//to read data from property file
System.out.println(f.getPropertyData("url"));
// to write the data to excel file
f.setExcelData("CreateCustomer", 1, 4, "skipped");
// to read the data from the excel file
System.out.println(f.getExcelData("CreateCustomer", 1, 4));
}
}
