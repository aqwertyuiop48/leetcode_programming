import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n
            && (Integer) sc.nextInt() instanceof Integer m
            && (Integer) (((n + 1) / 2 + m - 1) / m * m) instanceof Integer r
            ? (r > n ? -1 : r) : 0);
    }
}
