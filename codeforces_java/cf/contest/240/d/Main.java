import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean.valueOf(Boolean.valueOf(new java.io.File("input.txt").exists()) instanceof Boolean f
            && (f ? new java.io.FileInputStream("input.txt") : System.in).readAllBytes() instanceof byte[] raw
            && (f ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt")) : System.out) instanceof java.io.PrintStream out
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) g0[0] instanceof Integer n
            && (Integer) g0[1 + n] instanceof Integer m
            && IntStream.concat(IntStream.range(0, n).filter(i -> i == 0 || g0[1 + i] != g0[i]), IntStream.of(n)).toArray() instanceof int[] sa
            && IntStream.concat(IntStream.range(0, m).filter(j -> j == 0 || g0[2 + n + j] != g0[1 + n + j]), IntStream.of(m)).toArray() instanceof int[] sb
            && (Integer) (sa.length - 1) instanceof Integer p
            && (Integer) (sb.length - 1) instanceof Integer q
            && (Integer) g0[1] instanceof Integer ca
            && (Integer) g0[2 + n] instanceof Integer cb
            && (Integer) (ca.equals(cb) ? 0 : p > q ? 0 : q > p ? 1 : (ca ^ (p & 1)) == 0 ? 0 : 1) instanceof Integer offA
            && (Integer) (ca.equals(cb) ? 0 : 1 - offA) instanceof Integer offB
            && (Integer) (ca.equals(cb) ? Math.max(p, q) : p > q ? p : q > p ? q : p + 1) instanceof Integer r
            && (Integer) ((offA == 0 ? ca : cb) ^ ((r - 1) & 1)) instanceof Integer end
            && new int[r + 1] instanceof int[] cum
            && IntStream.range(0, r).allMatch(t ->
                (cum[t + 1] = cum[t]
                    + (t - offA >= 0 && t - offA < p ? sa[t - offA + 1] - sa[t - offA] : 0)
                    + (t - offB >= 0 && t - offB < q ? sb[t - offB + 1] - sb[t - offB] : 0)) >= 0)
            && out.append(IntStream.range(0, r).mapToObj(t ->
                    (t - offA >= 0 && t - offA < p ? IntStream.range(sa[t - offA], sa[t - offA + 1]).mapToObj(c -> " " + (c + 1)).collect(Collectors.joining()) : "")
                    + (t - offB >= 0 && t - offB < q ? IntStream.range(sb[t - offB], sb[t - offB + 1]).mapToObj(c -> " " + (n + c + 1)).collect(Collectors.joining()) : "")).collect(Collectors.joining()).substring(1)
                + "\n" + (r - 1 + end) + "\n"
                + IntStream.concat(IntStream.range(1, r).map(t -> cum[t]), end == 1 ? IntStream.of(n + m) : IntStream.empty()).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n").checkError());
    }
}
