public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); //3
        int b = calc.minus.apply(1,1); //0
        try {
            int c = calc.devide.apply(a, b); //делить на 0 нельзя
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}