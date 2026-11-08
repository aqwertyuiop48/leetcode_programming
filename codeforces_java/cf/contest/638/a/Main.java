import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer a
            ? a % 2 == 1 ? (a + 1) / 2 : (n - a) / 2 + 1 : 0);
    }
}
