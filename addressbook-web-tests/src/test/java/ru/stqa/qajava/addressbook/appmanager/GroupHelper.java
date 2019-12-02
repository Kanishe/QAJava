package ru.stqa.qajava.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.qajava.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void reternToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getGroupName());
    type(By.name("group_header"), groupData.getGroupHeader());
    type(By.name("group_footer"), groupData.getGroupFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  /**
   * Метод позволяет осуществить выбор группы по номеру индекса
   * @param index
   */

  public void selectGroup(int index) {
    driver.findElements(By.name("selected[]")).get(index).click();
  }

  public void initGroupModification() {
    click(By.name("edit"));

  }

  public void submitGroupModification() {//метод принятия можификации группы
    click(By.name("update"));
  }


  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitGroupCreation();
    reternToGroupPage();
  }

  /**
   * Метод модификации группы
   * @param index
   * @param group
   */
  public void modifyGroup(int index, GroupData group) {
    selectGroup(index);
    initGroupModification();
    fillGroupForm(group);
    submitGroupModification();
    reternToGroupPage();
  }


  /** Метод возвращает кол-во элементов
    * @return By.name(selected[])).size()
   */
  public int GetGroupCount() {
    return driver.findElements(By.name("selected[]")).size();
  }

  /** Метод для создания списка элементов
   * @return groups
   */
  public List<GroupData> getGroupList() {//todo разобрать
    List<GroupData>groups=new ArrayList<GroupData>();
    List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
    for(WebElement element: elements ){
      String nameElement=element.getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      GroupData groupData=new GroupData(id,nameElement, null,null);
      groups.add(groupData);
    }
      return groups;
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }


  }


