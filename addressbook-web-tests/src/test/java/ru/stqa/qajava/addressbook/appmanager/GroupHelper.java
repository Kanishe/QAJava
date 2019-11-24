package ru.stqa.qajava.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.qajava.addressbook.model.GroupData;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

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


  /** Метод возвращает кол-во элементов
   *
    * @return By.name(selected[])).size()
   */
  public int GetGroupCount() {
    return driver.findElements(By.name("selected[]")).size();
  }

  /** Метод для создания списка элементов
   *
   * @return groups
   */
  public List<GroupData> getGroupList() {
    List<GroupData>groups=new ArrayList<GroupData>();
    List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
    for(WebElement element: elements ){
      String nameElement=element.getText();
      GroupData groupData=new GroupData(nameElement, null,null);
      groups.add(groupData);
    }
      return groups;
  }
}
