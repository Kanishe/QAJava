package ru.stqa.qajava.addressbook;

import org.openqa.selenium.*;

import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase{


  @Test
  public void testGroupDeletion() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    goToGroupPage();
  }

  private void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  private void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }

}