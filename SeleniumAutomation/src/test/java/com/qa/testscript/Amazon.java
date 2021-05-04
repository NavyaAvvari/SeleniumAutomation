package com.qa.testscript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		int count=0, count1=0, count2=0, count3=0, count4=0;
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		   @SuppressWarnings("unused")
		ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   String title=driver.getTitle();
		   System.out.println(title);
		   for(int i=0;i<title.length();i++) {
			if(title.charAt(i)>='A' && title.charAt(i)<='Z') {
				count++;
			}
			else if(title.charAt(i)>='a' && title.charAt(i)<='z') {
				count1++;
			}
				else if(title.charAt(i)==' ') {
					count2++;
				}
					else if(title.charAt(i)>='0' && title.charAt(i)<='9') {
						count3++;
					}
						else {
							count4++;
						}
					
		   }
		   System.out.println("No.of uppercase characters in the title are"+ count);
		   System.out.println("No.of lowercase characters in the title are"+ count1);
		   System.out.println("No.of spaces characters in the title are"+ count2);
		   System.out.println("No.of digits characters in the title are"+ count3);
		   System.out.println("No.of special characters in the title are"+ count4);
		   driver.close();
		   
		   
		// TODO Auto-generated method stub

	}

}
