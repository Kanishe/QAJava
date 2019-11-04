package ru.stqa.qajava.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase{

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("te", "qerw", "er"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().reternToGroupPage();

  }

}
