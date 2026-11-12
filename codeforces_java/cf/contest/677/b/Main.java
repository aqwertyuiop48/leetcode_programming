import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[1]) instanceof Long h && Long.valueOf(t[2]) instanceof Long k && new long[2] instanceof long[] s
            && IntStream.range(3, t.length).allMatch(i -> Long.valueOf(t[i]) instanceof Long a
                && Long.valueOf(s[0] + a > h ? (s[0] + a - h + k - 1) / k : 0) instanceof Long w
                && (s[1] += w) >= 0 && (s[0] = Math.max(0, s[0] - w * k) + a) >= 0)
            ? s[1] + (s[0] + k - 1) / k : "");
    }
}
