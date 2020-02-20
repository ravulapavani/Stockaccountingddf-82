package driverscript;

import org.testng.annotations.Test;

import CommonFunLibrary.ERP_Functions;
import Utilities.ExcelFileUtil;

public class NewTest {
	ERP_Functions erp=new ERP_Functions();
  @Test
  public void f() throws Exception {
	  ExcelFileUtil exl=new ExcelFileUtil();
		int rowcount=exl.rowCount("supplier");
		for(int i=1;i<=rowcount;i++){
			String sname=exl.getData("supplier", i,0);
			String adress=exl.getData("supplier", i,1);
			String city=exl.getData("supplier", i,2);
			String country=exl.getData("supplier", i,3);
			String cperson=exl.getData("supplier", i,4);
			String pnumber=exl.getData("supplier", i,5);
			String mail=exl.getData("supplier", i,6);
			String mnumber =exl.getData("supplier", i,7);
			String note=exl.getData("supplier", i,0);
			
			erp.lanchAPP("http://webapp.qedge.com/");
			erp.login("admin","master");
			String result=erp.supplier(sname,adress,city,country,cperson,pnumber,mail,mnumber,note);
		
	      	exl.setData("supplier",i,9,result);
	      	erp.closebrw();
		}
  }
}
