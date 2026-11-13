import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && new int[]{sc.nextInt(), sc.nextInt(), -1, 0} instanceof int[] st && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(st[0] >= st[1] ? 0 : 1) instanceof Integer t0
                && Integer.valueOf(st[2] == t0 && st[3] == k ? 1 - t0 : t0) instanceof Integer t
                && st[t] > 0
                && (st[2] == t ? ++st[3] : (st[3] = 1)) > 0
                && (st[2] = t) >= 0
                && --st[t] >= 0
                && sb.append(t == 0 ? 'G' : 'B') != null)
            ? sb : "NO");
    }
}
