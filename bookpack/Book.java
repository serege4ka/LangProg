package bookpack;

public class Book {
        private String tittle;
        private String author;
        private int pubDate;

       public Book (String t, String a, int d) {
                tittle = t;
                author = a;
                pubDate = d;
        }

        public void show() {
                System.out.println(tittle);
                System.out.println(author);
                System.out.println(pubDate);
                System.out.println();

        }
}

