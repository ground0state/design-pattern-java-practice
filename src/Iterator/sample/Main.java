package Iterator.sample;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Kanno"));
    bookShelf.appendBook(new Book("Mori"));
    bookShelf.appendBook(new Book("Nishio"));
    bookShelf.appendBook(new Book("Higashino"));
    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }

  }

}
