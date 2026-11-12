import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && new long[]{Long.parseLong(t[1]), 0} instanceof long[] s
            && IntStream.range(0, Integer.parseInt(t[0])).filter(i -> (s[1] += t[2 + 2 * i].equals("+") ? 0 * (s[0] += Long.parseLong(t[3 + 2 * i])) : s[0] >= Long.parseLong(t[3 + 2 * i]) ? 0 * (s[0] -= Long.parseLong(t[3 + 2 * i])) : 1) < 0).count() == 0
            ? s[0] + " " + s[1] : "");
    }
}
