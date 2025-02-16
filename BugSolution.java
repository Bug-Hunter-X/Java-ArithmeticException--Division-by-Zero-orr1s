public class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            //Handle the exception appropriately, such as using a default value or logging the error.
            z = Integer.MAX_VALUE; // Or any other suitable default value
        }
        System.out.println(z);
    }
}