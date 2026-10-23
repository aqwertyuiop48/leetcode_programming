import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b
            && IntStream.range(0, a).map(i -> s.nextInt()).boxed().collect(Collectors.toSet()) instanceof Set<Integer> st
            ? IntStream.rangeClosed(1, n).mapToObj(i -> st.contains(i) ? "1" : "2").collect(Collectors.joining(" ")) : "");
    }
}
