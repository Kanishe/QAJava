package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before=app.getGroupHelper().GetGroupCount();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("te", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().reternToGroupPage();
    int after=app.getGroupHelper().GetGroupCount();
    Assert.assertEquals(after, before+1);

  }
}
