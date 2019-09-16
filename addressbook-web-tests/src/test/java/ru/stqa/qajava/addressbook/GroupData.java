package ru.stqa.qajava.addressbook;

public class GroupData {
  private final String namegroup;
  private final String headergroup;
  private final String footergroup;

  public GroupData(String namegroup, String headergroup, String footergroup) {
    this.namegroup = namegroup;
    this.headergroup = headergroup;
    this.footergroup = footergroup;
  }

  public String getNamegroup() {
    return namegroup;
  }

  public String getHeadergroup() {
    return headergroup;
  }

  public String getFootergroup() {
    return footergroup;
  }
}
