import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer r
            && Integer.valueOf(st.nextToken()) instanceof Integer c
            && IntStream.range(0, r).mapToObj(i -> st.nextToken()).toArray(String[]::new) instanceof String[] rows
            && IntStream.range(0, c).map(j -> Arrays.stream(rows).anyMatch(s -> s.charAt(j) == 'B') ? 1 : 0).toArray() instanceof int[] ne
            ? IntStream.range(0, c).filter(j -> ne[j] == 1 && (j == 0 || ne[j - 1] == 0)).count() : "");
    }
}
