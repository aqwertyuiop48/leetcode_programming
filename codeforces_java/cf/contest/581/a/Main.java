import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b ? Math.min(a, b) + " " + Math.abs(a - b) / 2 : "");
    }
}
