import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer t ? (t == 10 ? (n == 1 ? "-1" : "1" + "0".repeat(n - 1)) : String.valueOf(t).repeat(n)) : "");
    }
}
