import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && (Integer) s.chars().map(c -> c - '0').max().getAsInt() instanceof Integer mx
            ? mx + "\n" + IntStream.rangeClosed(1, mx).mapToObj(j -> String.valueOf(Long.parseLong(s.chars().mapToObj(c -> c - '0' >= j ? "1" : "0").collect(Collectors.joining())))).collect(Collectors.joining(" ")) : "");
    }
}
