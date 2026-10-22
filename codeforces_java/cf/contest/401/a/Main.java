import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); long x = (long) st.nval;
        long s = 0;
        for (int i = 0; i < n; i++) { st.nextToken(); s += (long) st.nval; }
        s = Math.abs(s);
        System.out.println((s + x - 1) / x);
    }
}
