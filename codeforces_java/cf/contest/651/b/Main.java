import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Long.valueOf(IntStream.range(0, n).map(i -> sc.nextInt()).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting())).values().stream().mapToLong(c -> c).max().getAsLong()) instanceof Long mx
            ? n - mx : "");
    }
}
