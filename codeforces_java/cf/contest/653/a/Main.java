import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).boxed().collect(Collectors.toSet()) instanceof Set<Integer> st
            ? (st.stream().anyMatch(x -> st.contains(x + 1) && st.contains(x + 2)) ? "YES" : "NO") : "");
    }
}
