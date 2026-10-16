import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
                System.out.print(n == 0 ? 1 : BigInteger.valueOf(3).modPow(BigInteger.valueOf(n - 1), BigInteger.valueOf(1000003)))));
    }
}



