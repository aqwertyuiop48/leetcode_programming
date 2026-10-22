import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        int[] a = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            st.nextToken();
            a[i] = (int) st.nval;
            total += a[i];
        }
        // y positions: cur level after segments
        int cur = 0, maxY = 0, minY = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) cur += a[i];
            else cur -= a[i];
            maxY = Math.max(maxY, cur);
            minY = Math.min(minY, cur);
        }
        int H = maxY - minY;
        char[][] g = new char[H][total];
        for (char[] r : g) Arrays.fill(r, ' ');
        int x = 0, y = -minY; // y = current height offset from bottom (level lines)
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < a[i]; t++) {
                if (i % 2 == 0) {
                    // up: '/' occupies row between y and y+1
                    g[y][x] = '/';
                    y++;
                } else {
                    y--;
                    g[y][x] = '\\';
                }
                x++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int r = H - 1; r >= 0; r--) {
            sb.append(new String(g[r])).append('\n');
        }
        System.out.print(sb);
    }
}
