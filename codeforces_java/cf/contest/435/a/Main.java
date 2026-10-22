import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        int buses = 0, cur = 0;
        boolean any = false;
        for (int i = 0; i < n; i++) {
            st.nextToken();
            int a = (int) st.nval;
            if (cur + a > m) {
                buses++;
                cur = a;
            } else cur += a;
        }
        buses++;
        System.out.println(buses);
    }
}
