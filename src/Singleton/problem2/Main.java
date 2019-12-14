package Singleton.problem2;

public class Main {

  public static void main(String[] args) {
    System.out.println("Start.");
    TicketMaker obj0 = TicketMaker.getInstance(0);
    TicketMaker obj1 = TicketMaker.getInstance(1);
    TicketMaker obj2 = TicketMaker.getInstance(2);
    System.out.println(obj0.getNextTicketNumber());
    System.out.println(obj1.getNextTicketNumber());
    System.out.println(obj0.getNextTicketNumber());

    System.out.println("End.");
  }

}
