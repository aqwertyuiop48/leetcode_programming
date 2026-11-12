import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Integer y
            && ((IntPredicate) z -> z % 400 == 0 || z % 4 == 0 && z % 100 != 0) instanceof IntPredicate lp
            && new int[]{y, 0} instanceof int[] st
            && IntStream.range(0, 1000).filter(i -> (st[1] = (st[1] + (lp.test(st[0]++) ? 366 : 365)) % 7) == 0 && lp.test(st[0]) == lp.test(y)).findFirst().isPresent()
            ? st[0] : "");
    }
}
