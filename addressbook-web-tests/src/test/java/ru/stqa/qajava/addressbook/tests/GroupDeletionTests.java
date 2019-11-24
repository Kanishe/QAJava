package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before=app.getGroupHelper().GetGroupCount();
    app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().reternToGroupPage();
    int after=app.getGroupHelper().GetGroupCount();
    Assert.assertEquals(after, before-1);
  }

}
