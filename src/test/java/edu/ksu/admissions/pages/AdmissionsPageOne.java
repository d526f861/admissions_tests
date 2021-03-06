package edu.ksu.admissions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by davidfreeman on 4/22/16.
 */
public class AdmissionsPageOne {

    private WebDriver driver;
    private WebDriverWait wait;

    //Set UI Elements
    private By hasID = By.id("ChooseTerm_choose_data_haveEidtrue");
    private By noID = By.id("ChooseTerm_choose_data_haveEidfalse");
    private By submit = By.id("ChooseTerm_choose_0");

    public AdmissionsPageOne(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void hasID(){
      wait.until(ExpectedConditions.presenceOfElementLocated(hasID));
      wait.until(ExpectedConditions.visibilityOfElementLocated(hasID));
      driver.findElement(hasID).click();
    }

    public void noID(){
      wait.until(ExpectedConditions.presenceOfElementLocated(noID));
      wait.until(ExpectedConditions.visibilityOfElementLocated(noID));
      driver.findElement(noID).click();
    }

    public void submit(){
      wait.until(ExpectedConditions.presenceOfElementLocated(submit));
      wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
      driver.findElement(submit).click();
    }
}
