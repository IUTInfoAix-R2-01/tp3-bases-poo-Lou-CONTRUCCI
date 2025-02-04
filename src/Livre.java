
public class Livre {
	private String name ;
	private double price ;
	private int quantite ;
	
	public Livre(String n, double p, int q) {
		this.name = n;
		this.price = p;
		this.quantite = q;
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
	
	public void setQuantite(int q) {
		quantite = q;
		
	}
	
	public String toString() {
		return "Livre[Name = "+name+", Price = "+price+" € , Quantité = "+quantite+"]";
	}
	
}
