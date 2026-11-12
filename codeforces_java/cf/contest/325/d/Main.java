
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (ps[0] = ps[0] * 10 + raw[i] - 48) < 0 | (ps[2] = 1) < 0
                : ps[2] == 0 || ((v[ps[1]++] = ps[0]) < 0 | (ps[0] = 0) < 0 | (ps[2] = 0) < 0)).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer r && Integer.valueOf(v[1]) instanceof Integer c && Integer.valueOf(v[2]) instanceof Integer n
            && Integer.valueOf(2 * c) instanceof Integer w
            && new int[r * w] instanceof int[] par && new int[18] instanceof int[] a && new int[2] instanceof int[] fr
            && ((IntUnaryOperator) u -> (par[u] & 33554431) == u + 1 ? u : (par[(par[u] & 33554431) - 1] & 33554431) == (par[u] & 33554431) ? (par[u] & 33554431) - 1
                : IntStream.iterate(u, t -> t >= 0, t -> (par[t] & 33554431) == t + 1 ? -1 : (par[t] = par[(par[t] & 33554431) - 1] & 33554431) - 1).reduce(u, (b, d) -> d)) instanceof IntUnaryOperator find
            ? c == 1 ? 0 : IntStream.range(0, n).filter(i -> Integer.valueOf(v[3 + 2 * i] - 1) instanceof Integer x1 && Integer.valueOf(v[4 + 2 * i] - 1) instanceof Integer y1
                && Integer.valueOf(x1 * w + y1) instanceof Integer p1 && Integer.valueOf(p1 + c) instanceof Integer p2
                && (fr[0] = -1) < 0 && (fr[1] = -1) < 0
                && Boolean.valueOf(IntStream.range(0, 18).anyMatch(t -> (a[t] = (x1 + t % 9 / 3 - 1) >= 0 && (x1 + t % 9 / 3 - 1) < r && par[(x1 + t % 9 / 3 - 1) * w + ((t < 9 ? y1 : y1 + c) + t % 3 - 1 < 0 ? (t < 9 ? y1 : y1 + c) + t % 3 - 1 + w : (t < 9 ? y1 : y1 + c) + t % 3 - 1 >= w ? (t < 9 ? y1 : y1 + c) + t % 3 - 1 - w : (t < 9 ? y1 : y1 + c) + t % 3 - 1)] != 0 ? find.applyAsInt((x1 + t % 9 / 3 - 1) * w + ((t < 9 ? y1 : y1 + c) + t % 3 - 1 < 0 ? (t < 9 ? y1 : y1 + c) + t % 3 - 1 + w : (t < 9 ? y1 : y1 + c) + t % 3 - 1 >= w ? (t < 9 ? y1 : y1 + c) + t % 3 - 1 - w : (t < 9 ? y1 : y1 + c) + t % 3 - 1)) : -1) >= 0
                    && (fr[t / 9] < 0 || (par[a[t]] >> 25 & 31) > (par[fr[t / 9]] >> 25 & 31) ? (fr[t / 9] = a[t]) >= 0 || true : true)
                    && (t < 9 ? (par[a[t]] |= 1073741824) < 0 : (par[a[t]] & 1073741824) != 0))) instanceof Boolean cf
                && IntStream.range(0, 18).filter(t -> a[t] >= 0 && ((t < 9 && (par[a[t]] &= 1073741823) < 0) | (!cf && a[t] != fr[t / 9] && ((par[fr[t / 9]] = par[fr[t / 9]] & 33554431 | Math.max(par[fr[t / 9]] >> 25 & 31, (par[a[t]] >> 25 & 31) + 1) << 25) < 0 | (par[a[t]] = fr[t / 9] + 1) < 0)))).count() == 0
                && !cf
                && (par[p1] = (fr[0] >= 0 ? fr[0] : p1) + 1) > 0 && (par[p2] = (fr[1] >= 0 ? fr[1] : p2) + 1) > 0).count() : "");
    }
}



