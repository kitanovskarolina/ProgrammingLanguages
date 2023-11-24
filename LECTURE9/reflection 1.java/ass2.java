package assss2;

class Test {
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

public class mainnn {
    public static void main(String[] args) {
        Test test = new Test();

        // Print class name
        System.out.println(test.getClass().getName());

        // Print constructor name
        System.out.println(test.getClass().getConstructors()[0].getName());

        // Print all methods names
        for (java.lang.reflect.Method method : test.getClass().getMethods()) {
            System.out.println(method.getName());
        }

        // Invoke method1 by providing the parameter name
        try {
            java.lang.reflect.Method method1 = test.getClass().getMethod("method1");
            method1.invoke(test);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Enable access to the field s before printing it
        try {
            java.lang.reflect.Field field = test.getClass().getDeclaredField("s");
            field.setAccessible(true);
            System.out.println(field.get(test));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Change the value of s
        try {
            java.lang.reflect.Field field = test.getClass().getDeclaredField("s");
            field.setAccessible(true);
            field.set(test, "New value");
            System.out.println(field.get(test));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Accessing private method using reflection
        try {
            java.lang.reflect.Method method = Test.class.getDeclaredMethod("method3");
            method.setAccessible(true);
            method.invoke(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

