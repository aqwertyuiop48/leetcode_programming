import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        st.nextToken(); int mi = (int) st.nval;
        st.nextToken(); int ma = (int) st.nval;
        boolean hasMin = false, hasMax = false, ok = true;
        for (int i = 0; i < m; i++) {
            st.nextToken(); int t = (int) st.nval;
            if (t < mi || t > ma) ok = false;
            if (t == mi) hasMin = true;
            if (t == ma) hasMax = true;
        }
        int need = (hasMin ? 0 : 1) + (hasMax ? 0 : 1);
        if (mi == ma) need = (hasMin ? 0 : 1);
        System.out.println(ok && need <= n - m ? "Correct" : "Incorrect");
    }
}
