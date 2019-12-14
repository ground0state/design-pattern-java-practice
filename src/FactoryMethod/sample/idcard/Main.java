package FactoryMethod.sample.idcard;

import FactoryMethod.sample.framework.Factory;
import FactoryMethod.sample.framework.Product;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("さっちん");
    Product card2 = factory.create("へごちん");
    Product card3 = factory.create("たっつん");

    card1.use();
    card2.use();
    card3.use();
  }

}
