package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.appmanager.GroupHelper;
import ru.stqa.qajava.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    GroupHelper groupHelper=app.getGroupHelper();
    int before=groupHelper.GetGroupCount();
    groupHelper.initGroupCreation();
    groupHelper.fillGroupForm(new GroupData("te", null, null));
    groupHelper.submitGroupCreation();
    groupHelper.reternToGroupPage();
    int after=groupHelper.GetGroupCount();
    Assert.assertEquals(after, before+1);
  }
}
