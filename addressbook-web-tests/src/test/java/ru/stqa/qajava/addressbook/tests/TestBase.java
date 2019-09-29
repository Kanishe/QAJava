package ru.stqa.qajava.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import ru.stqa.qajava.addressbook.appmanager.ApplicationManager;


public class TestBase {

  public final ApplicationManager app = new ApplicationManager(BrowserType.GOOGLECHROME);

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() {
    app.stop();
  }

}
