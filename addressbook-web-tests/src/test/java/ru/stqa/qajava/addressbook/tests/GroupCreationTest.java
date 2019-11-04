package ru.stqa.qajava.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("te", "qerw", "er"));
    app.submitGroupCreation();
    app.reternToGroupPage();
  }

}
