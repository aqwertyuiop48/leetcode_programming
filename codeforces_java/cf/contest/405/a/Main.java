import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        int[] cnt = new int[101];
        for (int i = 0; i < n; i++) { st.nextToken(); cnt[(int) st.nval]++; }
        StringBuilder sb = new StringBuilder();
        for (int v = 1; v <= 100; v++) for (int c = 0; c < cnt[v]; c++) sb.append(v).append(' ');
        System.out.println(sb.toString().trim());
    }
}
