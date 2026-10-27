import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).mapToLong(i -> (long) Integer.parseInt(tk.nextToken()) << 20 | i).sorted().toArray() instanceof long[] K && new int[3] instanceof int[] st
            && IntStream.range(0, 3 * n).allMatch(z -> st[1] >= n || (K[st[0]] >> 20 != K[st[1]] >> 20 ? (st[0] = st[1]) >= 0
                : (K[st[1]] & 1048575) - st[1] - (K[st[0]] & 1048575) + st[0] > k ? ++st[0] > 0 : (st[2] = Math.max(st[2], st[1] - st[0] + 1)) > 0 && ++st[1] > 0))
            ? st[2] : 0);
    }
}



