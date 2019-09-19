package ru.stqa.qajava.addressbook;


import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupFrom(new GroupData("test1", "test2", "test23"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
