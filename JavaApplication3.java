import java.util.Scanner;

public class JavaApplication3 {

 static int check(int i) {
    int temp = i;
    int reverse = 0;
    while (temp != 0) {
        reverse = temp % 10;
        i = i * reverse;
        temp = temp / 10;
    }
    return i;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter thye SEED value");
    int seed = in.nextInt();

    for (int i = 1;; i++) {
        int worked = check(i);
        if (worked == seed) {
            System.out.println("the number is:" + i);
            break;
        }
        in.close();

    }

}

}
