package excersie5;
class Egg{
	void EGG() {
		System.out.println("Each	egg	has	an	albumen	and	a	yolk");
	}
	void print() {
		System.out.println("The	egg	is	a	nutritional	product");
	}
}

 class OstricEgg extends Egg{
	
	void Egg() {
		System.out.println("The	albumen and	yol an	OSTRICH	egg	are	the	largest");
	}
}
}
public class EGGS {
			
	public static void main(String[] args) {
		Egg henEgg=new Egg();
		OstrichEgg ostrichEgg=new OstrichEgg();
		System.out.println("Hen Egg:");
		henEgg.display();
		henEgg();
		System.out.println("Ostrich egg:");
		ostrichEgg.display();
		ostrichEgg();
		
		
		}
}
