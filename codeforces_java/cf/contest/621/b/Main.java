import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new long[2002] instanceof long[] s && new long[2002] instanceof long[] d
            && IntStream.range(0, n).filter(i -> Integer.valueOf(st.nextToken()) instanceof Integer x
                && Integer.valueOf(st.nextToken()) instanceof Integer y
                && ++s[x + y] + ++d[x - y + 1000] < 0).count() >= 0
            ? Arrays.stream(s).map(c -> c * (c - 1) / 2).sum() + Arrays.stream(d).map(c -> c * (c - 1) / 2).sum() : "");
    }
}
