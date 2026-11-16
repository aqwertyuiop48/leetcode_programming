import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.of(0).peek(z -> IntStream.range(0, ni.getAsInt()).forEach(tc -> sb.append(Integer.valueOf(ni.getAsInt()) instanceof Integer n
                && st.nextToken() instanceof String str && new int[3 * n + 5] instanceof int[] s && new int[3] instanceof int[] cnt
                && new int[]{n, 0} instanceof int[] ln && new int[]{0, 0} instanceof int[] bst && new StringBuilder() instanceof StringBuilder o
                && IntStream.range(0, n).filter(i -> (s[i] = "LIT".indexOf(str.charAt(i))) >= 0 && ++cnt[s[i]] > 0).count() == n
                && (IntStream.range(0, 2 * n + 1).allMatch(it -> !(cnt[0] == cnt[1] && cnt[1] == cnt[2]) && (bst[0] = -1) == -1 && (bst[1] = 1 << 30) > 0
                    && IntStream.range(0, ln[0] - 1).filter(i -> s[i] != s[i + 1] && cnt[3 - s[i] - s[i + 1]] < bst[1] && (bst[1] = cnt[3 - s[i] - s[i + 1]]) >= 0 && (bst[0] = i) >= 0).count() >= 0
                    && bst[0] >= 0
                    && Stream.of(0).peek(w -> System.arraycopy(s, bst[0] + 1, s, bst[0] + 2, ln[0] - bst[0] - 1)).findFirst().isPresent()
                    && (s[bst[0] + 1] = 3 - s[bst[0]] - s[bst[0] + 2]) >= 0 && ++cnt[s[bst[0] + 1]] > 0 && ++ln[0] > 0 && ++ln[1] > 0
                    && o.append(bst[0] + 1).append('\n') != null) || true)
                ? (cnt[0] == cnt[1] && cnt[1] == cnt[2] ? ln[1] + "\n" + o : "-1\n") : "").append(""))).sum() == 0
            ? sb.toString() : "");
    }
}
