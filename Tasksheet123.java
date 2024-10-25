class Book{
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.price=price;
    }

  
    public String toString(){
        return "Title: "+title+"\n"+
                "Author: "+author+"\n"+
                "Year Published: "+yearPublished+"\n"+
                "Price: $"+ price+"\n";

    }

}
//MAIN METHOD
public class Tasksheet123 {

    public static void main(String[] args) {
        Book book1= new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", 2000, 700.76);
        Book book2= new Book("Game of Thrones", "George R. R. Martin", 1996, 500.54);
        Book book3= new Book("Fire & Blood ", "George R. R. Martin", 2018, 400.98);
        Book book4= new Book("Blown by the Wind  ", "jonaxx", 2017, 300);

       
        System.out.println("Book 1\n"+book1.toString()+"\n");
        System.out.println("Book 2\n"+book2.toString()+"\n");
        System.out.println("Book 3\n"+book3.toString()+"\n");
        System.out.println("Book 4\n"+book4.toString()+"\n");
       
    }
    
}
