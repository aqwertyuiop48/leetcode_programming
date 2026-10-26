import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer t
            && (Integer) 5000000 instanceof Integer big && new int[big + 1] instanceof int[] om
            && new int[big + 1] instanceof int[] spf
            && IntStream.rangeClosed(2, 2236).filter(p -> spf[p] == 0).allMatch(p -> IntStream.iterate(p * p, m -> m <= big, m -> m + p).peek(m -> spf[m] = spf[m] == 0 ? p : spf[m]).count() >= 0)
            && IntStream.rangeClosed(2, big).allMatch(i -> (om[i] = spf[i] == 0 ? 1 : om[i / spf[i]] + 1) > 0)
            && IntStream.rangeClosed(1, big).allMatch(i -> (om[i] += om[i - 1]) >= 0)
            ? IntStream.range(0, t).mapToObj(i -> String.valueOf(om[Integer.parseInt(tk.nextToken())] - om[Integer.parseInt(tk.nextToken())])).collect(Collectors.joining("\n")) : "");
    }
}
