package cookies;
class cookie{
	int weight;
	String shape;
	public cookie() {
		weight=0;
		shape="round";
	}
	public cookie(int w, String s) {
		weight=w;
		shape=s;
	}
	public void print() {
		System.out.println("this cookie weights "+weight+" and a shape "+shape);
	}
	
}
class coko_cookie extends cookie{
	int percent_coko;
	public coko_cookie(int w, String s, int p )
	{
		weight=0;
		shape="round";
		percent_coko=p;
	}
	public void print(){
		System.out.println("The cookie has a " +shape+ "shape and a weight of"
		 +weight+ "grams.");
		System.out.println("The percent of chocolate is"
		+percent_coko+ "%");
	
}
	}
	class coko_cookie_extra extends coko_cookie{
		String extra;
		public coko_cookie_extra(int w, String s, int p, String x) {
			super(w, s,p);
			extra=x;
		}
		public void print() {
			super.print();
			System.out.println("It also contains"+extra); 
		}
		}
	
public class cookies {

	public static void main(String[] args) {
		cookie TUTKU=new cookie(20,"shareno krugce");
		coko_cookie BOMBICA= new coko_cookie(20, "round", 30);
		coko_cookie_extra BAJADERA=new coko_cookie_extra(15,"parallelepiped", 60,
				"hazelnuts");
		System.out.println("\\nOutputting data for the cookie TUTKU:");
			System.out.println("* * * * * * * * * * * * * * * * * * * * ");
			TUTKU.print();
			System.out.println("\nOutputting data for the cookie BOMBICA:");
			System.out.println("* * * * * * * * * * * * * * * * * * * * ");
			BOMBICA.print();
			System.out.println("\nOutputting data for the cookie BAJADERA:");
			System.out.println("* * * * * * * * * * * * * * * * * * * * ");
			BAJADERA.print(); 
		

	}

}
