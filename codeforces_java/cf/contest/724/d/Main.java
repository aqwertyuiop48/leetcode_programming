import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer m && t[1].toCharArray() instanceof char[] s
            && ((IntUnaryOperator) c -> new int[]{-1, -1, 0} instanceof int[] st
                && IntStream.range(0, s.length).allMatch(i -> (s[i] < c ? (st[0] = i) >= 0 : s[i] == c ? (st[1] = i) >= 0 : true)
                    && (i - st[0] < m || (st[1] > st[0] && (st[0] = st[1]) >= 0 && ++st[2] > 0))) ? st[2] : -1) instanceof IntUnaryOperator cost
            && IntStream.rangeClosed('a', 'z').filter(c -> cost.applyAsInt(c) >= 0).findFirst() instanceof OptionalInt oc
            ? new String(t[1].chars().filter(x -> x < oc.getAsInt()).sorted().toArray(), 0, (int) t[1].chars().filter(x -> x < oc.getAsInt()).count())
                + String.valueOf((char) oc.getAsInt()).repeat(cost.applyAsInt(oc.getAsInt())) : "");
    }
}
