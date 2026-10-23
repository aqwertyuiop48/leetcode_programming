import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Long) s.nextLong() instanceof Long a && (Long) s.nextLong() instanceof Long b
            ? IntStream.range(0, n).mapToObj(i -> (Long) s.nextLong() instanceof Long x && (Long) (x * a / b) instanceof Long mo ? String.valueOf(x - (mo * b + a - 1) / a) : "").collect(Collectors.joining(" ")) : "");
    }
}
