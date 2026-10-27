import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(q ->
            System.out.println(Stream.iterate(new int[]{q[2], 0},
                    st -> st[0] >= BigInteger.valueOf(q[st[1]]).gcd(BigInteger.valueOf(st[0])).intValue(),
                    st -> new int[]{st[0] - BigInteger.valueOf(q[st[1]]).gcd(BigInteger.valueOf(st[0])).intValue(), 1 - st[1]})
                .count() % 2 == 1 ? 0 : 1));
    }
}

