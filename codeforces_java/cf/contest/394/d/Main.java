import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).sorted().toArray() instanceof int[] a
            && IntStream.rangeClosed(0, 20000).map(d -> IntStream.range(0, n).map(i -> a[i] - i * d).summaryStatistics() instanceof IntSummaryStatistics st ? (st.getMax() - st.getMin() + 1) / 2 : 0).toArray() instanceof int[] w
            && IntStream.rangeClosed(0, 20000).boxed().min(Comparator.comparingInt(d -> w[d])).get() instanceof Integer d
            ? w[d] + "\n" + (w[d] + IntStream.range(0, n).map(i -> a[i] - i * d).min().getAsInt()) + " " + d : "");
    }
}
