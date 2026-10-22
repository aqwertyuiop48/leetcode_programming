import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(t.nextToken()), m = Integer.parseInt(t.nextToken());
        boolean[] plus = new boolean[m];
        int[] id = new int[m];
        boolean[] seen = new boolean[n + 1];
        boolean[] online = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            t = new StringTokenizer(br.readLine());
            plus[i] = t.nextToken().charAt(0) == '+';
            id[i] = Integer.parseInt(t.nextToken());
            if (!seen[id[i]]) {
                seen[id[i]] = true;
                if (!plus[i]) online[id[i]] = true;
            }
        }
        boolean[] init = online.clone();
        List<Integer> res = new ArrayList<>();
        for (int x = 1; x <= n; x++) {
            if (!seen[x]) { res.add(x); continue; }
            boolean[] on = init.clone();
            int cnt = 0;
            for (int i = 1; i <= n; i++) if (on[i]) cnt++;
            boolean ok = true;
            if (cnt > 0 && !on[x]) ok = false;
            for (int i = 0; i < m && ok; i++) {
                if (plus[i]) { on[id[i]] = true; cnt++; } else { on[id[i]] = false; cnt--; }
                if (cnt > 0 && !on[x]) ok = false;
            }
            if (ok) res.add(x);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(res.size()).append('\n');
        for (int i = 0; i < res.size(); i++) sb.append(res.get(i)).append(i + 1 < res.size() ? " " : "");
        System.out.println(sb);
    }
}
