package ru.stqa.qajava.addressbook.model;

public class GroupData {
  private final String groupName;
  private final String groupHeader;
  private final String groupFooter;
  private final String id;

  public GroupData(String groupName, String groupHeader, String groupFooter) {
    this.id = null;
    this.groupName = groupName;
    this.groupHeader = groupHeader;
    this.groupFooter = groupFooter;
  }

  public GroupData(String groupName, String groupHeader, String groupFooter, String id) {
    this.groupName = groupName;
    this.groupHeader = groupHeader;
    this.groupFooter = groupFooter;
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupData groupData = (GroupData) o;

    if (groupName != null ? !groupName.equals(groupData.groupName) : groupData.groupName != null) return false;
    return id != null ? id.equals(groupData.id) : groupData.id == null;
  }

  @Override
  public int hashCode() {
    int result = groupName != null ? groupName.hashCode() : 0;
    result = 31 * result + (id != null ? id.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "groupName='" + groupName + '\'' +
            ", id='" + id + '\'' +
            '}';
  }

  public String getGroupName() {
    return groupName;
  }

  public String getGroupHeader() {
    return groupHeader;
  }

  public String getGroupFooter() {
    return groupFooter;
  }

  public String getId() {
    return id;
  }
}
