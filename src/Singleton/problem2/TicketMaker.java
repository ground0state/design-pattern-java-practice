package Singleton.problem2;

public class TicketMaker {
  private static TicketMaker ticketMaker0 = new TicketMaker();
  private static TicketMaker ticketMaker1 = new TicketMaker();
  private static TicketMaker ticketMaker2 = new TicketMaker();
  private int ticket = 1000;

  public static TicketMaker getInstance(int i) {
    switch (i) {
      case 0:
        return ticketMaker0;
      case 1:
        return ticketMaker1;
      case 2:
        return ticketMaker2;

      default:
        return ticketMaker0;
    }
  }

  public int getNextTicketNumber() {
    return ticket++;
  }

}
