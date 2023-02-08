package TestProject;

import java.util.concurrent.TimeUnit;

public class tc_01 extends baseClass {

	public static void main(String[] args) {
		
		openbrowser("Chrome");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		openurl();
		
		objectrepo.TestFormPage();
		
		objectrepo.formFill("Sahil", "Shaikh", "Indore", "Indian", "Male", "Football");
		
		objectrepo.submit();
		
		alert("ok");
		
		shutdown();
		
		
	
	}

}
