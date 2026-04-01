import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入第一个数:");
            double a = sc.nextDouble();

            System.out.println("请输入运算符(+ - * /):");
            char op = sc.next().charAt(0);

            System.out.println("请输入第二个数:");
            double b = sc.nextDouble();

            double result = calculate(a, b, op);
            System.out.println("结果是: " + result);

            System.out.println("是否继续？(y/n)");
            char choice = sc.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                System.out.println("程序结束");
                break;
            }
        }
    }

    // 计算方法
    public static double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("除数不能为0");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("运算符错误");
                return 0;
        }
    }
}

