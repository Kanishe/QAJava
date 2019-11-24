package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.appmanager.GroupHelper;
import ru.stqa.qajava.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData>before=app.getGroupHelper().getGroupList();
    GroupHelper groupHelper=app.getGroupHelper();
    groupHelper.initGroupCreation();
    groupHelper.fillGroupForm(new GroupData("test40", "40", "40"));
    groupHelper.submitGroupCreation();
    groupHelper.reternToGroupPage();
    List<GroupData>after=app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size()+1);
  }
}
