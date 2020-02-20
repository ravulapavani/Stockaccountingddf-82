package Utilities;

public class Dummy {

	public static void main(String[] args) throws Exception {
	ExcelFileUtil exl=new ExcelFileUtil();
	
	int totalRows=exl.rowCount("supplier");
	System.out.println("total no of rows are:"+totalRows);
	
	int totalCols=exl.colCount("Supplier");
	System.out.println("total no of cols are:"+totalCols);
	 
	String cellData=exl.getData("Supplier",2,3);
	System.out.println("the data in 2,3 col is:"+cellData);
	
	exl.setData("Supplier",4,9,"Fail");
	}

}

