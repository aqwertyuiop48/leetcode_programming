import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int sum = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int[] order = new int[limit];
        // sort numbers by lowbit desc via buckets
        int maxLb = 1;
        while (maxLb * 2 <= limit) maxLb *= 2;
        ArrayList<Integer> res = new ArrayList<>();
        for (int lb = maxLb; lb >= 1 && sum > 0; lb >>= 1) {
            for (int x = lb; x <= limit && sum >= lb; x += 2 * lb) {
                res.add(x);
                sum -= lb;
            }
        }
        if (sum != 0) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(res.size()).append('\n');
        for (int i = 0; i < res.size(); i++) sb.append(res.get(i)).append(i + 1 < res.size() ? " " : "\n");
        System.out.print(sb);
    }
}
