package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadExcel;
import pom.loginPage;

public class launchTest extends BaseTest
{
  @Test
  public void validTest() throws EncryptedDocumentException, IOException {
	  loginPage lp=new loginPage(driver);
	  ReadExcel re=new ReadExcel();
	  lp.setUsername().sendKeys(re.getDataFromExcel("Sheet1", 0, 0));
	  lp.setPassword().sendKeys(re.getDataFromExcel("Sheet1", 0, 1));
	  lp.clickLoginBTN().click();
	  
  }
}
