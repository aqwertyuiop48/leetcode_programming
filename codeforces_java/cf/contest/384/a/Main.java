import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? (n * n + 1) / 2 + "\n" + IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> (i + j) % 2 == 0 ? "C" : ".").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
