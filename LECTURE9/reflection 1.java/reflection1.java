import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
		try {
			Class d = Dog.class;
			String name = d.getName();
			System.out.println("Name: "+name);
			int modifier = d.getModifiers();
			String mod = Modifier.toString(modifier);
			System.out.println("Modifier: " + mod);
			Class superClass = d.getSuperclass();
			System.out.println("Superclass: " + superClass.getName());
			
		}
		catch(Exception e) {
			e.printStackTrace();
