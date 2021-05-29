package dataCollections;

import java.util.TreeSet;

public class TestTree {

    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("Как устроены кошки?");
        Book b2 = new Book("Постройте заново свое тело");
        Book b3 = new Book("В поисках Эмо");
        Book b4 = new Book("В поисках Эмо");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);

        System.out.println(tree);
    }

    class Book implements Comparable<Book>{
        String title;

        public Book(String t) {
            title = t;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }

        @Override
        public int compareTo(Book b) {
            return title.compareTo(b.getTitle());
        }
    }
}
