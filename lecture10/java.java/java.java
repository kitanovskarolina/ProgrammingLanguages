import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Demo {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Bob", "Alice", "Charlie");

        List<Student> students = names.stream()
            .map(name -> createStudent(name, generateRandomIndex(), generateRandomAge()))
            .toList();

        students.forEach(Demo::printValues);
    }

    static Student createStudent(String name, int indexNo, int age) {
        return new Student(name, indexNo, age);
    }

    static void printValues(Student student) {
        System.out.println("Name: " + student.getName() + ", Index Number: " + student.getIndexNo() + ", Age: " + student.getAge());
    }

    static int generateRandomIndex() {
        Random random = new Random();
        return random.nextInt(10000) + 1;
    }

    static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(13) + 18;
    }
}

class Student {
    private String name;
    private int indexNo;
    private int age;

    public Student(String name, int indexNo, int age) {
        this.name = name;
        this.indexNo = indexNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getIndexNo() {
        return indexNo;
    }

    public int getAge() {
        return age;
    }
}
