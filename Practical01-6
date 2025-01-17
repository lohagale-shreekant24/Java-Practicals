public class AccessTest {

    int globalVariable = 50; // Global (instance) variable

    public void methodOne() {
        int localVariable = 20; // Local variable
        System.out.println("Accessing Local Variable in methodOne: " + localVariable);
        System.out.println("Accessing Global Variable in methodOne: " + globalVariable);
    }

    public void methodTwo() {
        System.out.println("Accessing Global Variable in methodTwo: " + globalVariable);
        // The following line will cause an error because localVariable is not accessible here
        // System.out.println("Accessing Local Variable in methodTwo: " + localVariable);
    }

    public static void main(String[] args) {
        AccessTest accessTest = new AccessTest();
        accessTest.methodOne();
        accessTest.methodTwo();
    }
}
