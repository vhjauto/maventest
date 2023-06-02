package Pages;

public class LoginPage {
  
  public void enterusername(String un){
    
    driver.findElement(By.id("name")).sendKeys(un);
    Thread.sleep(2000);
  }

}
