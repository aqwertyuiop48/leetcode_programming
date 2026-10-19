import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(n - 1)) instanceof Integer k
            ? k + "\n" + IntStream.iterate(k - 1, b -> b >= 0, b -> b - 1).mapToObj(b -> IntStream.rangeClosed(1, n).filter(i -> ((i - 1) >> b & 1) == 0).boxed().toList() instanceof List<Integer> g
                ? g.size() + " " + g.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "").collect(Collectors.joining("\n")) : "");
    }
}
