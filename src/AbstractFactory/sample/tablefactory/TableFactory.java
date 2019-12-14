package AbstractFactory.sample.tablefactory;

import AbstractFactory.sample.factory.Factory;
import AbstractFactory.sample.factory.Link;
import AbstractFactory.sample.factory.Page;
import AbstractFactory.sample.factory.Tray;

public class TableFactory extends Factory {
  public Link createLink(String caption, String url) {
    return new TableLink(caption, url);
  }

  public Tray createTray(String caption) {
    return new TableTray(caption);
  }

  public Page createPage(String title, String author) {
    return new TablePage(title, author);
  }
}
