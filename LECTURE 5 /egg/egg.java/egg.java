package egg;
class egg
{  int category;
public egg(int c) 
{
	category=c;
}
	void EGG() {
	System.out.println("Each	egg	has	an	albumen	and	a	yolk");
	}
    void print() {
    	System.out.println("The	egg	is a nutritional	product");	
    }
    public int getCategory(){
    	return category;
    	}
    public void setCategory(int newCategory){
		category = newCategory;
		}

}
 class ostrich_egg extends egg{
	 public ostrich_egg(int c) {
		 super(c);
	 }
	void print() {
		System.out.println("The	albumen	and	yolk an	OSTRICH	egg	are	the	largest");
	}
	public int getCategory(){
		return category;
		}
	public void setCategory(int newCategory){
		super.setCategory(newCategory);
		}
}
public class karolina {

	public static void main(String[] args) {
	egg henEgg=new egg(0);
	ostrich_egg Ostrich_egg=new ostrich_egg(0);
	System.out.println("Calling methods:");
	System.out.println("For the hen's egg");
	henEgg.print();
	henEgg.EGG();
	henEgg.setCategory(1);
	System.out.println("the catagory of this egg is"+henEgg.getCategory());
	System.out.println("For the ostrich's egg");
    Ostrich_egg.print();
    Ostrich_egg.EGG();
    Ostrich_egg.setCategory(2);
    System.out.println("the catagory of this egg is"+Ostrich_egg.getCategory());

	}

}
