import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new BigInteger(s.next())).ifPresent(v -> System.out.print(v.abs().bitLength() < 8 ? "byte" : v.abs().bitLength() < 16 ? "short" : v.abs().bitLength() < 32 ? "int" : v.abs().bitLength() < 64 ? "long" : "BigInteger")));
    }
}


