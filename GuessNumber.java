import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // 1~100

        Scanner sc = new Scanner(System.in);
        int count = 0; // 记录猜的次数

        while (true) {
            System.out.println("请输入1-100之间的数字:");
            int guess = sc.nextInt();
            count++;

            if (guess > target) {
                System.out.println("猜大了");
            } else if (guess < target) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了！");
                System.out.println("你一共猜了 " + count + " 次");
                break;
            }
        }
    }
}
