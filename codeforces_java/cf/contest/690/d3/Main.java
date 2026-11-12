import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer c
            && Integer.valueOf(st.nextToken()) instanceof Integer w
            && Integer.valueOf(st.nextToken()) instanceof Integer h
            && Integer.valueOf(w + 1) instanceof Integer s
            && new long[][]{IntStream.range(0, s * s).mapToLong(x -> (x % s == 0 ? 1 : 0) + (x % s == x / s + 1 && x / s < w ? h : 0)).toArray()} instanceof long[][] bs
            && new long[][]{IntStream.range(0, s).mapToLong(j -> j == 0 ? 1 : 0).toArray()} instanceof long[][] vh
            && IntStream.range(0, 27).allMatch(b -> (((c >> b) & 1) == 0
                    || (vh[0] = IntStream.range(0, s).mapToLong(j -> IntStream.range(0, s).mapToLong(i -> vh[0][i] * bs[0][i * s + j]).sum() % 1000003L).toArray()) != null)
                && (b == 26 || (bs[0] = IntStream.range(0, s * s).parallel().mapToLong(x -> IntStream.range(0, s).mapToLong(k -> bs[0][(x / s) * s + k] * bs[0][k * s + x % s]).sum() % 1000003L).toArray()) != null))
            ? Arrays.stream(vh[0]).sum() % 1000003L : "");
    }
}
