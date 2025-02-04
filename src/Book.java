
public class Book {
	private String name ;
	private Author[] authors;
	private double price ;
	private int quantite ;
	
	public Book(String n, Author[] a, double p) {
		this.name = n;
		this.price = p;
		this.authors = a;
	}
	
	public Book(String n, Author[] a,double p, int q) {
		this.name = n;
		this.price = p;
		this.quantite = q;
		this.authors = a;
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
/* exercice 2-1
	public Author getAuthor() {
		return authors;
	}
	
	public String getAuthorEmail() {
		return authors.getEmail();
	}
	
	public char getAuthorGender() {
		   return authors.getGender();  // cannot use author.name as name is private in Author class
		}
*/
	public void setQuantite(int q) {
		quantite = q;
		
	}
	
	public void setPrice(double p) {
		this.price =p ;
	}
	
	public String toString() {
		return "Book[Name = "+name+", "+ authors+ "Price = "+price+" € , Quantité = "+quantite+"]";
	}
	
	public String getAuthorName() {
		   return authors.getName();  
		}
	
}


