import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n
            ? String.format("%.3f", 5 + IntStream.range(0, n).mapToDouble(i -> sc.nextDouble() * 0 + sc.nextDouble()).sum() / n) : "");
    }
}
