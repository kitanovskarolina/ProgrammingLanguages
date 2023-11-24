package assignment;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
    private String s;

    public Test() {
        this.s = "Programming languages";
    }

    public void method1() {
        System.out.println(this.s);
    }

    public void method2(int n) {
        System.out.println(n);
    }

    private void method3() {
        System.out.println("Private method is invoked");
    }
}
public class mainn {

	public static void main(String[] args) {
		 Test test = new Test();
         Class cls=test.getClass();
         System.out.println("The name of the class is "+cls.getName());
         Constructor constructor=cls.getConstructor();
         System.out.println("The name of the constructor is "+ constructor.getName());
         Method[] methods=cls.getMethods();
         
	       
	        }

	}
