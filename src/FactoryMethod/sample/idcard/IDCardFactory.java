package FactoryMethod.sample.idcard;

import java.util.ArrayList;
import java.util.List;
import FactoryMethod.sample.framework.Factory;
import FactoryMethod.sample.framework.Product;

public class IDCardFactory extends Factory {
  private List owners = new ArrayList();

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    owners.add(((IDCard) product).getOwner());
  }
}
