package TestProject;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG extends baseClass{
	
	
	

	  @Test(priority =1 )  
	  @Parameters("BrowserNameTNG")
	  
	  public void presetup(String BrowserNameTNG) {
		  
		 
		  openbrowser(BrowserNameTNG);
		 
		 openurl();
	  }
	  
	  @Test(priority =2 )
	  public void NavigateToPage() {
		  
		  objectrepo.TestFormPage();
		  
	  }

	  @Test(priority =3, dataProvider = "supplydata" )
	  @Parameters({"fname","lname","add", "citizen", "gender", "intrest"})
	  
	 
	  
	  public void fillform(String fname,String lname, String add, String citizen, String gender, String intrest) {
	  
		  objectrepo.formFill(fname, lname, add, citizen, gender, intrest);
		  objectrepo.submit();
		  alert("ok");
	  }
	  


	  @DataProvider
	  public Object[][] supplydata() throws Exception {
	    
		  //file location 
		  FileInputStream fis = new FileInputStream("D:\\selenium\\testdata\\testData (1).xlsx");
		  
		  //Create workbook
		
		 Workbook wb = WorkbookFactory.create(fis);
			 
		  
		  //defining Sheet 
		  Sheet sh = (Sheet) wb.getSheet("Sheet3");
		  
		  int rownum = sh.getLastRowNum()+1;
		  System.out.println("the number of rows are " + rownum);
		  
		  int colnum = sh.getRow(0).getLastCellNum();
		  System.out.println("The number of coloumn are " + colnum);
		  
		    Object[][] dataSet = new Object[rownum][colnum];
		 
		    for (int row=0;row<rownum;row++) {
		    	
		    	for (int col=0; col<colnum; col++) {
		    		dataSet[row][col] = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(row).getCell(col).toString();
		    		
		    		// dataSet[row][col] = sh.getRow(row).getCell(col).toString();
		    	}
		    }
		  
		return dataSet;
		  
	  }
		   
		  
		  @Test
		  public void Shutdown(String browser) {
		  shutdown();
		  
	  }

	}
