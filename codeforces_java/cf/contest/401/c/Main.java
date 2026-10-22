import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        if (n - 1 > m || m > 2 * (n + 1)) { System.out.println(-1); return; }
        StringBuilder sb = new StringBuilder();
        int run = 0; char last = ' ';
        while (n > 0 || m > 0) {
            if (m > n && run < 2) { sb.append('1'); m--; run++; last = '1'; }
            else if (n > 0 && last != '0') { sb.append('0'); n--; run = 0; last = '0'; }
            else if (m > 0 && run < 2) { sb.append('1'); m--; run++; last = '1'; }
            else { System.out.println(-1); return; }
        }
        System.out.println(sb);
    }
}
