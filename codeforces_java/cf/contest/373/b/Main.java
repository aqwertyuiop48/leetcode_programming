import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long w && Long.valueOf(sc.nextLong()) instanceof Long m && Long.valueOf(sc.nextLong()) instanceof Long k
            && new long[]{m, w, 0} instanceof long[] s
            && Integer.valueOf(String.valueOf(m).length()) instanceof Integer len
            && (IntStream.rangeClosed(len, 18).allMatch(L -> Long.valueOf((long) Math.pow(10, L)) instanceof Long hi
                && Long.valueOf(hi - s[0]) instanceof Long cnt
                && Long.valueOf(Math.min(cnt, s[1] / (L * k))) instanceof Long take
                && (s[1] -= take * L * k) >= 0 && (s[2] += take) >= 0 && (s[0] = hi) > 0 && take.longValue() == cnt.longValue()) || true)
            ? s[2] : "");
    }
}
