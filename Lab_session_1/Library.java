class Book
{
    public String title;
    public String author;
    public String bn;
    public int year;

    public Book(String title, String author, String bn, int year) {
        this.title = title;
        this.author = author;
        this.bn = bn;
        this.year = year;
    }

    public void display()
    {
        System.out.println("Book title: " + title);
        System.out.println("Author: "+ author);
	System.out.println("Book number: "+ bn);
	System.out.println("Published year: "+ year);
    }
}
public class Library
{
    public static void main(String args[])
    {
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", "9788173711466", 1999);
        book1.display();

    }
}
 