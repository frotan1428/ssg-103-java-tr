package ssgmapHashtableHashmap1;


import java.util.Hashtable;
import java.util.Map;

public class Book {


    //bir kitabin  id ismi  yazari, Yayımcı, miktar olarak map olusturmak istiyoruz
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {

        Map<Integer,Book> bookList=new Hashtable<Integer,Book>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        bookList.put(1,b1);
        bookList.put(2,b2);
        bookList.put(3,b3);

        System.out.println(bookList);


        // her bir elemeni ekranda yaziniz.
        for(Map.Entry<Integer, Book> entry:bookList.entrySet()){

            Book b=entry.getValue();
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }


    }
}
