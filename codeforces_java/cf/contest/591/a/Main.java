import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer l && (Integer) s.nextInt() instanceof Integer p && (Integer) s.nextInt() instanceof Integer q
            ? java.math.BigDecimal.valueOf((double) l * p / (p + q)).stripTrailingZeros().toPlainString() : "");
    }
}
