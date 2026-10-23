import java.math.BigInteger;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(Pattern.compile("(-?[0-9]+)([-+*/%])(-?[0-9]+)").matcher(new Scanner(System.in).nextLine().replace(" ", "")) instanceof Matcher m && m.matches() && new BigInteger(m.group(1)) instanceof BigInteger a && new BigInteger(m.group(3)) instanceof BigInteger b && (b.signum() == 0 ? BigInteger.ONE : b) instanceof BigInteger d ? List.of(a.add(b), a.subtract(b), a.multiply(b), a.divide(d), a.remainder(d)).get("+-*/%".indexOf(m.group(2))) : "");
    }
}
