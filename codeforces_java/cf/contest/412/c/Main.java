import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String first = br.readLine().trim();
        int L = first.length();
        char[] res = new char[L];
        Arrays.fill(res, '#');
        boolean[] conf = new boolean[L];
        for (int i = 0; i < n; i++) {
            String s = i == 0 ? first : br.readLine().trim();
            for (int j = 0; j < L; j++) {
                char c = s.charAt(j);
                if (c == '?') continue;
                if (res[j] == '#') res[j] = c;
                else if (res[j] != c) conf[j] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < L; j++) sb.append(conf[j] ? '?' : res[j] == '#' ? 'x' : res[j]);
        System.out.println(sb);
    }
}
