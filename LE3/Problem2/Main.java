public class Main {
    public static void main(String[] args) {
        // Test case 1: Using the Test class
        Test test = new Test();
        test.display(); 

        // Test case 2: Using AbsTest, but we need a concrete subclass to implement the display() method
        AbsTest absTest = new AbsTest() {
            @Override
            public void display() {
                System.out.println("Display method implemented in ConcreteTest class!");
            }
        };
        absTest.display(); 
    }
}