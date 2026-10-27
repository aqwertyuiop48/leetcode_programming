import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextLine().trim())).ifPresent(n ->
            System.out.println(
                new HashMap() instanceof Map dp
                && new BigInteger[]{BigInteger.ZERO} instanceof BigInteger[] best
                && IntStream.range(0, n).allMatch(i ->
                    sc.nextLine().trim().split("\\s+") instanceof String[] parts
                    && new int[]{Integer.parseInt(parts[1])} instanceof int[] x
                    && ((parts[0].equals("win")
                        ? (best[0].compareTo((BigInteger) dp.getOrDefault(x[0], BigInteger.valueOf(-1))) > 0 && dp.put(x[0], best[0]) == null)
                        : (dp.containsKey(x[0])
                            && new BigInteger[]{((BigInteger) dp.get(x[0])).add(BigInteger.TWO.pow(x[0]))} instanceof BigInteger[] cand
                            && (cand[0].compareTo(best[0]) <= 0 || (best[0] = cand[0]) != null)
                            && dp.remove(x[0]) != null))
                        || true))
                ? best[0]
                : BigInteger.ZERO)));
    }
}





