import java.util.Scanner;

class Calculator {
    private int a;
    private int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getSum() {
        return a + b;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        Calculator calc = new Calculator(a, b);
        System.out.printf("X = %d%n", calc.getSum());   
    }
}