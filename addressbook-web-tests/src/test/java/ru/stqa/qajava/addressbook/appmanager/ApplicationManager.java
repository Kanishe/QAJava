package ru.stqa.qajava.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  public WebDriver wd;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper ;
  private String browser ;
  private SessionHelper sessionHelper ;
  public StringBuffer verificationErrors = new StringBuffer();
  private String baseUrl;
  private boolean acceptNextAlert = true;

  public ApplicationManager(String browser) {
    this.browser=browser;
  }

  public void init() {
    if (browser==BrowserType.GOOGLECHROME){
      System.setProperty("webdriver.chrome.driver","/Users/alexandrkanishevskii/IdeaProjects/chromedriver");
      wd = new ChromeDriver();
    } else if (browser==BrowserType.FIREFOX){
      System.setProperty("webdriver.gecko.driver","/Users/alexandrkanishevskii/IdeaProjects/geckodriver");
      wd = new FirefoxDriver();
    }

    baseUrl = "https://www.katalon.com/";
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/index.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper=new SessionHelper(wd);
    sessionHelper.login("admin","secret");
  }



  public void stop() {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }



  private String closeAlertAndGetItsText() {
    try {
      Alert alert = wd.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
