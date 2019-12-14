package AbstractFactory.sample.listfactory;

import AbstractFactory.sample.factory.Link;

public class ListLink extends Link {

  public ListLink(String caption, String url) {
    super(caption, null);
  }

  @Override
  public String makeHTML() {
    return "  <li><a href=\"" + "\">" + caption + "</a></li>\n";
  }


}
