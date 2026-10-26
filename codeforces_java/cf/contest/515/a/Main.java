import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && (Integer) s.nextInt() instanceof Integer t
            ? t >= Math.abs(a) + Math.abs(b) && (t - Math.abs(a) - Math.abs(b)) % 2 == 0 ? "Yes" : "No" : "");
    }
}
