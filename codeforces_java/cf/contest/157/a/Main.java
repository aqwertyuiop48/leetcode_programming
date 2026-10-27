import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> s.nextInt()).toArray()).toList() instanceof List<int[]> g
            ? IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, n).filter(j -> IntStream.range(0, n).map(r -> g.get(r)[j]).sum() > Arrays.stream(g.get(i)).sum()).boxed()).count()
            : 0);
    }
}

