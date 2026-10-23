import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] mx && new int[n + 2] instanceof int[] cm && new int[n + 2] instanceof int[] h && new int[3] instanceof int[] cur
            ? IntStream.rangeClosed(2, n + 1).mapToObj(v -> (par[v] = Integer.parseInt(tk.nextToken())) > 0 && (h[v] = 1) > 0 && (cur[0] = par[v]) > 0 && (cur[1] = 0) == 0 && (cur[2] = 1) > 0
                && (IntStream.range(0, 40).anyMatch(step -> !(cur[2] > mx[cur[0]] ? (mx[cur[0]] = cur[2]) > 0 && (cm[cur[0]] = 1) > 0 : cur[2] == mx[cur[0]] ? ++cm[cur[0]] > 0 : true) || (cur[0] == 1)
                    || !((Integer) (mx[cur[0]] + (cm[cur[0]] >= 2 ? 1 : 0)) instanceof Integer nh && nh != h[cur[0]] && (cur[1] = h[cur[0]]) >= 0 && (cur[2] = nh) > 0 && (h[cur[0]] = nh) > 0 && (cur[0] = par[cur[0]]) > 0)) || true)
                ? String.valueOf(mx[1]) : "").collect(Collectors.joining(" ")) : "");
    }
}
