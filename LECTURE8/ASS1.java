package fdfdf;


	 interface Two_D_Shape {

	    float PI = 3.14f;
	    void parameters();
	    float area();
	    float perimeter();
		boolean rectangular();
	}
	 interface Three_D_Shape {
	    float volume();
	}
	  class Triangle implements Two_D_Shape {
		  
		    private float sideA;
		    private float sideB;
		    private float sideC;
		    private float height;

		  
		    public Triangle(float sideA, float sideB, float sideC, float height) {
		        this.sideA = sideA;
		        this.sideB = sideB;
		        this.sideC = sideC;
		        this.height = height;
		        System.out.println("A new triangle is created");
		    }

		    @Override
		    public void parameters() {
		    	System.out.println("Side A: " + sideA + ", Side B: " + sideB + ", Side C: " + sideC + ", Height: " + height);
		    }

		    @Override
		    public float area() {
		    	return 0.5f * sideA * height;
		    }

		    @Override
		    public float perimeter() {
		 
		    	return sideA + sideB + sideC;
		    }


		    public boolean rectangular() {
		        return Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2);
		    }

		}
	  abstract class Sphere implements Two_D_Shape, Three_D_Shape {
		   
		    float radius;

		 
		    public Sphere(float radius) {
		        this.radius = radius;
		        System.out.println("A new sphere has been created");
		    }

		 
		    @Override
		    public void parameters() {
		    	 System.out.println("Radius: " + radius);
		    }

		    @Override
		    public float area() {
		    	return PI * radius * radius;
		    }

		    @Override
		    public float perimeter() {
		    	return 2 * PI * radius;
		    }

		    // Implementing method from Three_D_Shape
		    @Override
		    public float volume() {
		    	return (float) ((4/3) * PI * Math.pow(radius, 3));
		    }
		}


	 public class objects {
	public static void main(String[] args) {
		 Triangle T1 = new Triangle(3,5,6,3);
	        Sphere B1 = new Sphere(4);
	        Two_D_Shape T2 = new Triangle(8,2,10,16);
	        Two_D_Shape B2 = new Sphere(3);
	        Three_D_Shape B3 = new Sphere(7);
	        System.out.println("Triangle 1:");
	        T1.parameters();
	        T1.area();
	        T1.rectangular();
	        T1.perimeter();
	        // Print the parameters of the second triangle
	        System.out.println("Triangle 2:");
	        T2.parameters();
	        T2.area();
	        T2.rectangular();
	        T2.perimeter();

	}

}
