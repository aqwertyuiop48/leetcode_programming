import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> s.next()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().mapToLong(Long::longValue).max().getAsLong() : 0L);
    }
}
