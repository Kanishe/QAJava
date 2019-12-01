package ru.stqa.qajava.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.qajava.addressbook.appmanager.GroupHelper;
import ru.stqa.qajava.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData>before=app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("test2",null,null);
    app.getGroupHelper().createGroup(group);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size()+1);

// Сравнение циклом
//    int max = 0;
//    for (GroupData g : after){
//      if (g.getId() > max){
//        max = g.getId();
//      }
//    }

/** лямбда выражения для сравниения id  вместо обычного цыкла
*/

 group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(group);
    Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(),g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);//todo хот фикс правера не правильная
  }

}
