import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer k
            ? k % 2 == 1 ? "-1" : IntStream.range(0, k).mapToObj(z -> IntStream.range(0, k).mapToObj(i -> IntStream.range(0, k).mapToObj(j -> (i + j / 2 + z / 2) % 2 == 0 ? "b" : "w")
                .collect(Collectors.joining())).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n")) : "");
    }
}
