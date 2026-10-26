import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer d
            ? "1 ".repeat(n - 2) + "2 " + (d + n) : "");
    }
}
