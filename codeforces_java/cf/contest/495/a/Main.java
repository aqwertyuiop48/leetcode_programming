import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new int[]{2, 7, 2, 3, 3, 4, 2, 5, 1, 2} instanceof int[] f
            && Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer x
            ? f[x / 10] * f[x % 10]
            : 0);
    }
}
