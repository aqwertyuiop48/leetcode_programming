import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int k = (int) st.nval;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (int) st.nval; }
        Arrays.sort(a);
        System.out.println(a[n - k]);
    }
}
