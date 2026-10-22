import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? new StringBuilder(s).reverse().chars().map(c -> c - '0').mapToObj(d -> (d >= 5 ? "-O|" : "O-|") + "O".repeat(d % 5) + "-" + "O".repeat(4 - d % 5)).collect(Collectors.joining("\n")) : "");
    }
}
