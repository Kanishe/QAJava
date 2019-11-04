package ru.stqa.qajava.addressbook.tests;

import org.testng.annotations.*;


public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("te", "qerw", "er"));
    submitGroupCreation();
    reternToGroupPage();
  }

}
