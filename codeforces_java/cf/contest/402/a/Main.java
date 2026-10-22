import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); long k = (long) st.nval;
        st.nextToken(); long a = (long) st.nval;
        st.nextToken(); long b = (long) st.nval;
        st.nextToken(); long v = (long) st.nval;
        int boxes = 0;
        while (a > 0) {
            long d = Math.min(k - 1, b);
            b -= d;
            a -= (d + 1) * v;
            boxes++;
        }
        System.out.println(boxes);
    }
}
