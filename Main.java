public class Main {
        public static void main(String[] args) {
        IOperator sum = new Sum();
        IOperator sub = new Subtract();

        System.out.println("Sum: " + sum.apply(10, 5));
        System.out.println("Subtract: " + sub.apply(10, 5));
    }
}
