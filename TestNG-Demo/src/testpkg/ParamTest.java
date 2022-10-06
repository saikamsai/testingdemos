package testpkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTest {
	
	@DataProvider
	public Object[][] getData() {
		 Object[][] data=new  Object[3][2];
		 data[0][0]="john";
		 data[0][1]=25;
		 
		 data[1][0]="sam";
		 data [1][1]=38;
		 

		 data[2][0]="max";
		 data[2][1]=28;
		 return data;
		
	}
	
	@Test(dataProvider="getData")
	public void applyForLoan(String username, int age) {
		System.out.println("SignIn:" + username + "/" + age);
	}

}
