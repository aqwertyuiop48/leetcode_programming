import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            ? IntStream.rangeClosed(1, n).mapToObj(i -> i % 2 == 1 ? "#".repeat(m) : i % 4 == 2 ? ".".repeat(m - 1) + "#" : "#" + ".".repeat(m - 1)).collect(Collectors.joining("\n")) : "");
    }
}
