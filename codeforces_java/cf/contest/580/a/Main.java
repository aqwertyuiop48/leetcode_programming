import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).toArray() instanceof int[] a && new int[n] instanceof int[] run
            ? IntStream.range(0, n).map(i -> run[i] = (i > 0 && a[i] >= a[i - 1]) ? run[i - 1] + 1 : 1).max().getAsInt() : 0);
    }
}
