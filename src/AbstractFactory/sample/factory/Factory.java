package AbstractFactory.sample.factory;

public abstract class Factory {
  public static Factory getFactory(String classname) {
    Factory factory = null;
    try {
      factory = (Factory) Class.forName(classname).newInstance();
    } catch (ClassNotFoundException e) {
      System.out.println("クラス" + classname + "が見つかりません。");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return factory;
  }

  public abstract Link createLink(String caption, String url);

  public abstract Tray createTray(String caption);

  public abstract Page createPage(String titlle, String author);

}
