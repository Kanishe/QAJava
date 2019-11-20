package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int begin=app.getGroupHelper().GetGroupCount();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().reternToGroupPage();
    int after=app.getGroupHelper().GetGroupCount();
    Assert.assertEquals(after, begin-1);
  }

}
