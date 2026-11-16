import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer t
            ? IntStream.range(0, t).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
                && IntStream.range(0, n).map(j -> Integer.parseInt(tk.nextToken())).summaryStatistics() instanceof IntSummaryStatistics st
                ? String.valueOf(st.getMax() - st.getMin()) : "").collect(Collectors.joining("\n")) : "");
    }
}
