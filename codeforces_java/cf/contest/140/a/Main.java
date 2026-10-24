import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Double.valueOf(s.nextInt()) instanceof Double R
            && Double.valueOf(s.nextInt()) instanceof Double r
            ? r <= R && (n == 1 || Math.sin(Math.PI / n) * (R - r) >= r - 1e-9) ? "YES" : "NO"
            : "");
    }


}
