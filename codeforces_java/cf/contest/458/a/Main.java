import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(Math.max(t[0].length(), t[1].length()) + 3) instanceof Integer L
            && new int[L] instanceof int[] c
            && IntStream.range(0, t[0].length()).allMatch(i -> (c[L - t[0].length() + i] += t[0].charAt(i) - '0') >= 0)
            && IntStream.range(0, t[1].length()).allMatch(i -> (c[L - t[1].length() + i] -= t[1].charAt(i) - '0') > -2)
            && new int[1] instanceof int[] r
            && (IntStream.range(0, L - 2).allMatch(j ->
                (c[j + 1] += c[j]) == c[j + 1]
                && (c[j + 2] += c[j]) == c[j + 2]
                && (Math.abs(c[j + 1] * 1.618033988749895 + c[j + 2]) <= 3
                    || ((r[0] = c[j + 1] * 1.618033988749895 + c[j + 2] > 0 ? 1 : 2) > 5))) || true)
            ? (r[0] == 1 || r[0] == 0 && c[L - 2] * 1.618033988749895 + c[L - 1] > 1e-9) ? ">"
                : (r[0] == 2 || r[0] == 0 && c[L - 2] * 1.618033988749895 + c[L - 1] < -1e-9) ? "<" : "="
            : "");
    }
}
