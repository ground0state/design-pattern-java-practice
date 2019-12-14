package Builder.sample;

public class Main {

  public static void main(String[] args) {
    String[] args1 = new String[1];
    args1[0] = "html";
    if (args1.length != 1) {
      System.exit(0);
    }
    if (args1[0].equals("plain")) {
      TextBuilder textBuilder = new TextBuilder();
      Director director = new Director(textBuilder);
      director.construct();
      String result = textBuilder.getResult();
      System.out.println(result);
    } else if (args1[0].equals("html")) {
      HTMLBuilder htmlBuilder = new HTMLBuilder();
      Director director = new Director(htmlBuilder);
      director.construct();
      String filename = htmlBuilder.getResult();
      System.out.println(filename + "が作成されました。");
    }
  }
}
