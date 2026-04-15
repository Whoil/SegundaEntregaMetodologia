package ParteB.Persistencia.de.Datos;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty =0;


    public Book(String names, Author[] authors, double price) {
    this.name = names;
    this.authors = authors;
    this.price = price;
    }

    public Book() {
    }

    public Book(String names, Author[] authors, double price, int qty) {
        this(names,authors,price);
        this.qty=qty;
    }

    public String getName() {
            return name;
    }

    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty) {
        this.qty=qty;
    }

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        if(authors.length==0) {
            return "";
        } else {
            for (int i = 0; i < authors.length; ++i) {
                if (i > 0) {
                    names.append(", ");
                }
                names.append(authors[i].getName());
            }
        }
        return names.toString();
    }
    @Override
    public String toString() {
        return "Book[ name="+ name + ", authors=" + getAuthorNames() + ",price="+ price + ",qty=" + qty + "]";
    }
}
