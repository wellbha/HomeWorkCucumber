package nopcommerce;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    public void openHomePage(){
        driver.get("https://demo.nopcommerce.com/");
    }
    public void clickOnBooks(){
        driver.findElement(By.linkText("Books")).click();
    }
    public void clickOnApparel(){
        driver.findElement(By.linkText("Apparel")).click();
    }
    public void clickOnComputers(){
        driver.findElement(By.linkText("Computers")).click();
    }
    public void clickOnDigitalDownload(){
        driver.findElement(By.linkText("Digital downloads")).click();
    }
    public void clickOnElectronics(){
        driver.findElement(By.linkText("Electronics")).click();
    }
    public void clickOnGiftCards(){
        driver.findElement(By.linkText("Gift Cards")).click();
    }
    public void clickOnJewelry(){
        driver.findElement(By.linkText("Jewelry")).click();
    }
    public void clickOnCategory(String category){
        driver.findElement(By.linkText(category)).click();
    }

}
