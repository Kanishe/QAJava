package ru.stqa.qajava.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.model.GroupData;

public class GroupModificationTests extends  TestBase{
  @Test
  public void testGroupModification()throws Exception{
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupFrom(new GroupData(null, null, null));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }

}
