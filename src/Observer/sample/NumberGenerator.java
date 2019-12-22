package Observer.sample;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
  private ArrayList observers = new ArrayList(); // Observerたちを保持

  public void addObserver(Observer observer) { // Observerを追加
    observers.add(observer);
  }

  public void deleteObserver(Observer observer) { // Observerを削除
    observers.remove(observer);
  }

  public void notifyObservers() {
    Iterator it = observers.iterator();
    while (it.hasNext()) {
      Observer o = (Observer) it.next();
      o.update(this);
    }
  }

  public abstract int getNumber();

  public abstract void execute();
}
