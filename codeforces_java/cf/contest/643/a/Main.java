import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] t
            && new int[n + 1] instanceof int[] cnt && new int[n + 1] instanceof int[] res && new int[1] instanceof int[] best
            && IntStream.range(0, n).allMatch(i -> Stream.of(0).peek(z -> Arrays.fill(cnt, 0)).findFirst().isPresent() && (best[0] = 0) == 0
                && IntStream.range(i, n).allMatch(j -> (++cnt[t[j]] > cnt[best[0]] || (cnt[t[j]] == cnt[best[0]] && t[j] < best[0]) ? (best[0] = t[j]) > 0 : true) && ++res[best[0]] > 0))
            ? Arrays.stream(res, 1, n + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
