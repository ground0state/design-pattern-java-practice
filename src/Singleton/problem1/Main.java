package Singleton.problem1;

public class Main {

  public static void main(String[] args) {
    System.out.println("Start.");
    TicketMaker obj1 = TicketMaker.getInstance();
    TicketMaker obj2 = TicketMaker.getInstance();
    System.out.println(obj1.getNextTicketNumber());
    System.out.println(obj2.getNextTicketNumber());
    System.out.println(obj1.getNextTicketNumber());

    System.out.println("End.");
  }

}
