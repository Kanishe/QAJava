package ru.stqa.qajava.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("te", "qerw", "er"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().reternToGroupPage();
  }

}
