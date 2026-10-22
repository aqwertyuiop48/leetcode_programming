import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        String ok = "AHIMOTUVWXY";
        int n = s.length();
        boolean good = true;
        for (int i = 0; i < n; i++) {
            if (ok.indexOf(s.charAt(i)) < 0 || s.charAt(i) != s.charAt(n - 1 - i)) { good = false; break; }
        }
        System.out.println(good ? "YES" : "NO");
    }
}
