import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer k && Integer.valueOf(s.nextInt()) instanceof Integer d
            ? d == 0 ? k == 1 ? "0" : "No solution" : d + "0".repeat(k - 1) : "");
    }
}
