import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && new int[1] instanceof int[] par
            ? IntStream.range(0, n).mapToObj(i -> (par[0] ^= (Integer.parseInt(st.nextToken()) - 1) & 1) == 1 ? "1" : "2").collect(Collectors.joining("\n")) : "");
    }
}
