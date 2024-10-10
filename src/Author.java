public class Author {
    private String name;
    private int BooksCount;
    private boolean IsBestSeller;

    public Author(){
    }

    public Author(String name,int BooksCount,boolean IsBestSeller)
    {
        this.name=name;
        this.BooksCount=BooksCount;
        this.IsBestSeller=IsBestSeller;
    }

    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getBooksCount() {
        return BooksCount;
    }

    public void setBooksCount(int booksCount) {
        BooksCount = booksCount;
    }

    public boolean isBestSeller() {
        return IsBestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        IsBestSeller = bestSeller;
    }
}
