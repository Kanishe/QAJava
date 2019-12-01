package ru.stqa.qajava.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.stqa.qajava.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected static ApplicationManager app = new ApplicationManager(BrowserType.CHROME);// Делегирование//передаем в класс переменную выбранного браузера

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite
  public void tearDown() throws Exception {
    app.stop();
  }

}
