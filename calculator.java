import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = input.nextInt(),b = input.nextInt();
        int sum = a + b,subtraction = a - b,product = a * b;
        double division = (double)a / b;

        System.out.printf("%d + %d = %d\n", a, b, sum);
        System.out.printf("%d - %d = %d\n", a, b, subtraction);
        System.out.printf("%d * %d = %d\n", a, b, product);
        System.out.printf("%d / %d = %.2f\n", a, b, division);

        input.close();
    }
}
