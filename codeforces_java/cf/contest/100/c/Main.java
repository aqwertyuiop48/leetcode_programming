import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new BigInteger(s.next())).ifPresent(a -> System.out.print(a.add(new BigInteger(s.next())))));
    }
}

