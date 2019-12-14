package Iterator.problem1;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.appendBook(new Book("Kanno"));
    bookShelf.appendBook(new Book("Mori"));
    bookShelf.appendBook(new Book("Nishio"));
    bookShelf.appendBook(new Book("Higashino"));
    bookShelf.appendBook(new Book("Matsuo"));
    bookShelf.appendBook(new Book("Shibata"));
    bookShelf.appendBook(new Book("Marukawa"));
    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }

  }

}
