import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer t
            ? IntStream.range(0, t).mapToObj(i -> Integer.valueOf(st.nextToken()) instanceof Integer n
                && Integer.valueOf(st.nextToken()) instanceof Integer r
                && Integer.valueOf(IntStream.range(0, n - 1).map(j -> Integer.parseInt(st.nextToken())).sum()) instanceof Integer sm
                && Integer.valueOf(((r - sm) % n + n) % n) instanceof Integer g
                ? String.valueOf(g == 0 ? n : g) : "").collect(Collectors.joining("\n")) : "");
    }
}
