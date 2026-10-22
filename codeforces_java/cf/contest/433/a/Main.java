import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> sc.nextInt() == 100).count()) instanceof Integer c1
            && Integer.valueOf(n - c1) instanceof Integer c2
            ? c1 % 2 == 0 && (c1 > 0 || c2 % 2 == 0) ? "YES" : "NO" : "");
    }
}
