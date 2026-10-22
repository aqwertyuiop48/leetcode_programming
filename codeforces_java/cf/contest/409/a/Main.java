import java.util.*;
import java.io.*;
public class Main {
    static int id(String s) { return s.equals("[]") ? 0 : s.equals("()") ? 1 : 2; }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().trim(), b = br.readLine().trim();
        // 8< beats [], [] beats (), () beats 8<
        int w1 = 0, w2 = 0;
        for (int i = 0; i + 1 < a.length() && i + 1 < b.length(); i += 2) {
            int x = id(a.substring(i, i + 2)), y = id(b.substring(i, i + 2));
            if (x == y) continue;
            // beats: 2 beats 0, 0 beats 1, 1 beats 2
            boolean xw = (x == 2 && y == 0) || (x == 0 && y == 1) || (x == 1 && y == 2);
            if (xw) w1++; else w2++;
        }
        System.out.println(w1 > w2 ? "TEAM 1 WINS" : w2 > w1 ? "TEAM 2 WINS" : "TIE");
    }
}
