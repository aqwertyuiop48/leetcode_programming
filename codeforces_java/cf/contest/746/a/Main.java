import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer b && Integer.valueOf(sc.nextInt()) instanceof Integer c
            ? 7 * Math.min(a, Math.min(b / 2, c / 4)) : "");
    }
}
