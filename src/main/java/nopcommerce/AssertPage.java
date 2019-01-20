package nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertPage extends BasePage{

    public void booksPageSuccess(){
        String actualBooksPage = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedBooksPage = "Books";
        System.out.println(actualBooksPage);
        Assert.assertEquals(expectedBooksPage,actualBooksPage);
    }
    public void apparelPageSuccess(){
        String actualApparelPage = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedApparelsPage = "Apparel";
        System.out.println(actualApparelPage);
        Assert.assertEquals(expectedApparelsPage,actualApparelPage);
    }
    public void computersPageSuccess(){
        String actualComputerPage = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedComputerPage = "Computers";
        System.out.println(actualComputerPage);
        Assert.assertEquals(expectedComputerPage,actualComputerPage);
    }
    public void digitalDownloadPageSuccess(){
        String actualDigitalDownloadPage = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedDigitalDownloadPage = "Digital downloads";
        System.out.println(actualDigitalDownloadPage);
        Assert.assertEquals(expectedDigitalDownloadPage,actualDigitalDownloadPage);
    }
    public void electronicsPageSuccess(){
        String actualElectronicsPage = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedElectronicsPage = "Electronics";
        System.out.println(actualElectronicsPage);
        Assert.assertEquals(expectedElectronicsPage,actualElectronicsPage);
    }
    public void giftCardsPageSuccess(){
        String actualGiftCardsPage = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedGiftCardsPage = "Gift Cards";
        System.out.println(actualGiftCardsPage);
        Assert.assertEquals(expectedGiftCardsPage,actualGiftCardsPage);
    }
    public void jewelryPageSuccess(){
        String actualJewelryPage = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedJewelryPage = "Jewelry";
        System.out.println(actualJewelryPage);
        Assert.assertEquals(expectedJewelryPage,actualJewelryPage);
    }

}
