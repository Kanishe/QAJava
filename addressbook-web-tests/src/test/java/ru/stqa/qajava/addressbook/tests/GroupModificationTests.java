package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.model.GroupData;

import java.util.List;

public class GroupModificationTests extends TestBase{

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before=app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() -1);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("te", "qerw", "er"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().reternToGroupPage();
    List<GroupData>after=app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size());

  }

}
