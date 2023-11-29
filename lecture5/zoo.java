package animal;
class Animal{
public String name;
public Animal(){
name=" ";
}
public Animal(String n){
name=n;
}
public void onomatopoeia()
{
System.out.println("There is no onomatopoeia for"+name);
}
}
class Dog extends Animal{
	public Dog(String n) {
		super(n);
	}
	public void onomatopoeia()
	{
	System.out.println("Dogs go woof");
	}
	
}
class Lion extends Animal{
	public Lion(String n) {
		super(n);
	}
	public void onomatopoeia()
	{
	System.out.println("Lion goes rawr");
	}
}
class Frog extends Animal{
	public Frog(String n) {
		super(n);
	}
	public void onomatopoeia()
	{
	System.out.println("frogs go gruug");
	}
}
class SARA_MOUNTAIN_DOG extends Dog{
	public SARA_MOUNTAIN_DOG(String n) {
		super(n);
	}
	public void onomatopoeia() {
        System.out.println("Sara Mountain Dogs bark loudly!");
    }
	public void traits() {
		System.out.println("Sara_mountain_dog Sarko is the Macedonian champion for 2009");
	}
}
public class zoo {
	
	public static void main(String[] a) {
	Animal[] animals = new Animal[6];
    
   
    animals[0] = new Dog("Buddy");
    animals[1] = new Dog("Rex");
    animals[2] = new Lion("Simba");
    animals[3] = new Frog("Kermit");
    animals[4] = new SARA_MOUNTAIN_DOG("Rocky");
    animals[5] = new Animal("Generic Animal");

    // Invoke onomatopoeia() for each object in the array
    for (Animal animal : animals) {
        animal.onomatopoeia();
        if (animal instanceof SARA_MOUNTAIN_DOG) {
            SARA_MOUNTAIN_DOG saraMountainDog = (SARA_MOUNTAIN_DOG) animal;
            saraMountainDog.traits();
        }
}
   
	}
}
