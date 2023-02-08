package TestProject;

import org.openqa.selenium.By;

public class objectrepo  extends baseClass{

	public static By TestingFormPageLink= By.xpath("//a[contains(text(), \"Testing Form Page\")]");
	public static By ShortWaitLink = By.xpath("//a[contains(text(), \"Short Wait\")]");
	
	public static By fName = By.xpath("//input[@id='ts_first_name']");
	public static By lName = By.xpath("//input[@id='ts_last_name']");
	public static By address = By.xpath("//textarea[@id='ts_address']");
	public static By nationality = By.xpath("//select[@id=\"ts_country\"]");
	public static By male = By.xpath("//*[@value='male']");
	public static By female = By.xpath("//*[@value='female']");
	public static By cricket = By.id("ts_checkbox1");
	public static By football = By.id("ts_checkbox2");
	public static By hockey = By.id("ts_checkbox3");
	public static By submit = By.name("Submit1");
	public static By pageheading = By.xpath("//strong[contains(text(), 'Automation Testing Form')]");

	public static void TestFormPage() {
		select(TestingFormPageLink);
	}

	
	public static void ShortWait() {
		select(ShortWaitLink);
	}
	
	public static void formFill(String fname, String lname, String add, String citizen, String gender, String intrest) {
		
		entertext(fName, fname);
		entertext(lName,lname);
		entertext(address, add);
		
		if (gender.equalsIgnoreCase("Male")) {
			select(male);
		}else if (gender.equalsIgnoreCase("female")) {
			select(female); 

		select(nationality, citizen);
		
		if (intrest.equalsIgnoreCase("Cricket")) {
			select(cricket);
			
		}else if
		 (intrest.equalsIgnoreCase("Hockey")) {
			select(hockey);
			
		}else if  (intrest.equalsIgnoreCase("Football")) {
			select(football);
			
		}
		}
		
		
}
	public static void submit() {
		select(submit);
		
	}
		}	



