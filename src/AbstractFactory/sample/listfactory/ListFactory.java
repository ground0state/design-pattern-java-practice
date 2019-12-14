package AbstractFactory.sample.listfactory;

import AbstractFactory.sample.factory.Factory;
import AbstractFactory.sample.factory.Link;
import AbstractFactory.sample.factory.Page;
import AbstractFactory.sample.factory.Tray;

public class ListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String titlle, String author) {
    return new ListPage(titlle, author);
  }

}
