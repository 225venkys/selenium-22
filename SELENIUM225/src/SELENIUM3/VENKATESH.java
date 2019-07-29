package SELENIUM3;

import org.openqa.selenium.chrome.ChromeDriver;

public class VENKATESH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println("the title is :" +title);
		driver.close();
	}
				

	}
		
	


