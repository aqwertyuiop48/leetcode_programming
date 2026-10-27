import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer order
            && new long[]{0, 0, sc.nextLong()} instanceof long[] st
            && IntStream.range(0, order).allMatch(i -> Long.valueOf(1L << i) instanceof Long s
                && Long.valueOf(1 & (st[2] / 2)) instanceof Long rx
                && Long.valueOf(1 & (st[2] ^ rx)) instanceof Long ry
                && (ry != 0 || (((rx != 1) || ((st[0] = s - 1 - st[0]) >= 0 && (st[1] = s - 1 - st[1]) >= 0))
                    && (st[0] ^= st[1]) >= 0 && (st[1] ^= st[0]) >= 0 && (st[0] ^= st[1]) >= 0))
                && (st[0] += s * rx) >= 0 && (st[1] += s * ry) >= 0 && (st[2] /= 4) >= 0)
            ? st[0] + " " + st[1]
            : "");
    }
}

