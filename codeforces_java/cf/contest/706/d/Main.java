import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer q
            && new int[2 * (30 * (q + 1) + 2)] instanceof int[] ch && new int[30 * (q + 1) + 2] instanceof int[] cn && new int[3] instanceof int[] sts
            && IntStream.iterate(29, b -> b >= 0, b -> b - 1).filter(b -> (cn[sts[0] = (ch[2 * sts[0]] != 0 ? ch[2 * sts[0]] : (ch[2 * sts[0]] = ++sts[2]))] += 1) < 0).count() >= 0
            ? IntStream.range(0, q).mapToObj(i -> Character.valueOf(st.nextToken().charAt(0)) instanceof Character op && Integer.valueOf(st.nextToken()) instanceof Integer x && Integer.valueOf(sts[0] = 0) != null
                ? op == '?'
                    ? String.valueOf(IntStream.iterate(29, b -> b >= 0, b -> b - 1).filter(b -> (sts[0] = (ch[2 * sts[0] + 1 - ((x >> b) & 1)] != 0 && cn[ch[2 * sts[0] + 1 - ((x >> b) & 1)]] > 0)
                        ? (sts[1] |= 1 << b) * 0 + ch[2 * sts[0] + 1 - ((x >> b) & 1)] : ch[2 * sts[0] + ((x >> b) & 1)]) < 0).count() * 0 + (Integer.valueOf(sts[1]) instanceof Integer res && Integer.valueOf(sts[1] = 0) != null ? res : 0))
                    : IntStream.iterate(29, b -> b >= 0, b -> b - 1).filter(b -> (cn[sts[0] = (ch[2 * sts[0] + ((x >> b) & 1)] != 0 ? ch[2 * sts[0] + ((x >> b) & 1)] : (ch[2 * sts[0] + ((x >> b) & 1)] = ++sts[2]))] += op == '+' ? 1 : -1) < -1000).count() > 0 ? "" : ""
                : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
