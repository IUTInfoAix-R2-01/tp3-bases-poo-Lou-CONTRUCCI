
public class testLivre {

	public static void main(String[] args) {
		Livre l1 = new Livre("Le Labyrinthe", 28, 5);
		System.out.println(l1);
		
		Livre l2 = new Livre("one piece", 13.99, 12);
		System.out.println(l2);
		
		l1.setQuantite(4);
		l2.setQuantite(8);
		System.out.println(l1);		
		System.out.println(l2);
	}

}
