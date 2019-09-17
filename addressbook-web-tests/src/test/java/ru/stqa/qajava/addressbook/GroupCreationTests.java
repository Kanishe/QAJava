package ru.stqa.qajava.addressbook;


import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("testnamegroup", "testheadergroup", "testfootergroup"));
    submitGroupCreation();
    returnToHeadPage();
  }

}
