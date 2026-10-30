import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer n && new int[n] instanceof int[] pm && new int[n] instanceof int[] sm
                && IntStream.range(0, n).filter(i -> (pm[i] = Math.max(i == 0 ? 0 : pm[i - 1], o[1 + i])) < 0).count() >= 0
                && IntStream.range(0, n).filter(k -> (sm[n - 1 - k] = Math.min(k == 0 ? Integer.MAX_VALUE : sm[n - k], o[n - k])) < 0).count() >= 0
                ? 1 + IntStream.range(0, n - 1).filter(i -> pm[i] <= sm[i + 1]).count() : 0);
    }
}
