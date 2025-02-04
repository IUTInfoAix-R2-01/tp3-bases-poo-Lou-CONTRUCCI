
public class testBook {
	public static void main(String[] args) {
		Author JD = new Author("James Dasher", "james.dasher@nowhere.com", 'm'); // Test the constructor
		System.out.println(JD);

		Book laby = new Book("Le Labyrinthe", JD, 28, 99);
		System.out.println(laby); // Test Book's toString()

		// Test Getters and Setters
		laby.setPrice(29.95);
		laby.setQuantite(28);
		System.out.println("name is: " + laby.getName());
		System.out.println("price is: " + laby.getPrice());
		System.out.println("qty is: " + laby.getQuantite());
		System.out.println("Author is: " + laby.getAuthor());  // Author's toString()
		System.out.println("Author's name is: " + laby.getAuthor().getName());
		System.out.println("Author's email is: " + laby.getAuthor().getEmail());

		// Use an anonymous instance of Author to construct a Book instance
		Book anotherBook = new Book("more Java", 
		      new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
		System.out.println(anotherBook);
		
		Book aBook = new Book("living", 
			      new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'), 10.95);
		System.out.println(aBook);
		System.out.println("Author's name is: " + aBook.getAuthor().getName());
		System.out.println("Author's email is: " + aBook.getAuthor().getEmail());
	
	}
}
