

public class Book {
    private int pagesCount;
    private String title;
    private String coverColor;
    private Author author;
    private double price;
    private String publisher;

    public Book(){
        title="unknown title";
        author=new Author();
    }

    public Book(int pagesCount,String title,String coverColor,Author author,double price,String publisher){
        this.pagesCount=pagesCount;
        this.title=title;
        this.coverColor=coverColor;
        this.author=author;
        this.price=price;
        this.publisher=publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getCoverColor() {return coverColor;}

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
