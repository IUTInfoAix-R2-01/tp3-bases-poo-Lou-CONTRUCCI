
public class Book {
	private String name ;
	private Author author;
	private double price ;
	private int quantite ;
	
	public Book(String n, Author a, double p) {
		this.name = n;
		this.price = p;
		this.author = a;
	}
	
	public Book(String n, Author a,double p, int q) {
		this.name = n;
		this.price = p;
		this.quantite = q;
		this.author = a;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public String getAuthorName() {
		   return author.getName();  
		}
	
	public String getAuthorEmail() {
		return author.getEmail();
	}
	
	public char getAuthorGender() {
		   return author.getGender();  // cannot use author.name as name is private in Author class
		}
	
	public void setQuantite(int q) {
		quantite = q;
		
	}
	
	public void setPrice(double p) {
		this.price =p ;
	}
	
	public String toString() {
		return "Book[Name = "+name+", "+ author+ "Price = "+price+" € , Quantité = "+quantite+"]";
	}
	
}


