import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && (Long) IntStream.range(0, n).mapToLong(i -> s.nextLong()).sum() instanceof Long a
            && (Long) IntStream.range(0, n - 1).mapToLong(i -> s.nextLong()).sum() instanceof Long b
            && (Long) IntStream.range(0, n - 2).mapToLong(i -> s.nextLong()).sum() instanceof Long c
            ? (a - b) + "\n" + (b - c) : "");
    }
}
