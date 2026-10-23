import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            ? IntStream.range(0, n).mapToObj(i -> s.next() instanceof String r ? IntStream.range(0, m).mapToObj(j -> r.charAt(j) == '-' ? "-" : (i + j) % 2 == 0 ? "B" : "W").collect(Collectors.joining()) : "").collect(Collectors.joining("\n")) : "");
    }
}
