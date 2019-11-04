package ru.stqa.qajava.addressbook.model;

public class GroupData {
  private final String groupName;
  private final String gropupHeader;
  private final String groupFooter;

  public GroupData(String groupName, String gropupHeader, String groupFooter) {
    this.groupName = groupName;
    this.gropupHeader = gropupHeader;
    this.groupFooter = groupFooter;
  }

  public String getGroupName() {
    return groupName;
  }

  public String getGropupHeader() {
    return gropupHeader;
  }

  public String getGroupFooter() {
    return groupFooter;
  }
}
