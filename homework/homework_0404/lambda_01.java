package homework_0404;

public class lambda_01 {
    public static void main(String[] args) {
        action((a) -> {
            for (int i : a) {
                if (!(i <= 1) && i % 2 == 0) System.out.println(i);
            }
        });
    }

    public static void action(PrintEvenNum pen) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        pen.printevennum(num);
    }
}
