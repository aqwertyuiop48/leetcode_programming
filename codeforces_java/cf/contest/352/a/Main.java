import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> s.nextInt() == 0).count()) instanceof Integer z
            ? z == 0 ? "-1" : n - z < 9 ? "0" : "5".repeat((n - z) / 9 * 9) + "0".repeat(z) : "");
    }
}
