import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        long[] stk = new long[n + 1];
        int top = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            st.nextToken(); long v = (long) st.nval;
            while (top >= 2 && stk[top - 2] >= stk[top - 1] && v >= stk[top - 1]) {
                ans += Math.min(stk[top - 2], v);
                top--;
            }
            stk[top++] = v;
        }
        Arrays.sort(stk, 0, top);
        for (int i = 0; i < top - 2; i++) ans += stk[i];
        System.out.println(ans);
    }
}
