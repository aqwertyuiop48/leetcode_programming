import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) (2 * Integer.parseInt(st.nextToken())) instanceof Integer n
            && new int[n] instanceof int[] pr
            && LongStream.range(1, n).flatMap(i -> LongStream.range(0, i).map(j -> ((1000000L - Integer.parseInt(st.nextToken())) << 40) | (i << 20) | j)).sorted().toArray() instanceof long[] ks
            && Arrays.stream(ks).filter(k -> pr[(int) (k >> 20 & 1048575)] == 0 && pr[(int) (k & 1048575)] == 0 && (pr[(int) (k >> 20 & 1048575)] = (int) (k & 1048575) + 1) > 0 && (pr[(int) (k & 1048575)] = (int) (k >> 20 & 1048575) + 1) > 0).count() >= 0
            ? Arrays.stream(pr).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
