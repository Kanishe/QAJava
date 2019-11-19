package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase{

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    int before=app.getGroupHelper().GetGroupCount();//todo поправить
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("te", "qerw", "er"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().reternToGroupPage();
    int after=app.getGroupHelper().GetGroupCount();
    Assert.assertEquals(after, before);


  }

}
