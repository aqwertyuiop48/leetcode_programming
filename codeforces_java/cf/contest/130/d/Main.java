import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(Stream.generate(s::nextBigInteger).limit(3).toList()).ifPresent(a -> System.out.print(a.get(0).modPow(a.get(1), a.get(2)))));
    }
}
