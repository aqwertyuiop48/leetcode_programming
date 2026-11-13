import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer z && Integer.valueOf(Integer.parseInt(z.nextToken())) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(z.nextToken())).toArray() instanceof int[] a && new int[]{0} instanceof int[] c
            && IntStream.range(0, n).allMatch(i -> a[i] - c[0] >= 0 && (c[0] = (a[i] - c[0]) % 2) >= 0) && c[0] == 0 ? "YES" : "NO");
    }
}
