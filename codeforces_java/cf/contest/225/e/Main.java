import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(BigInteger.TWO.modPow(BigInteger.valueOf(IntStream.of(2, 3, 5, 7, 13, 17, 19, 31, 61, 89, 107, 127, 521, 607, 1279, 2203, 2281, 3217, 4253, 4423, 9689, 9941, 11213, 19937, 21701, 23209, 44497, 86243, 110503, 132049, 216091, 756839, 859433, 1257787, 1398269, 2976221, 3021377, 6972593, 13466917, 20996011).toArray()[new Scanner(System.in).nextInt() - 1] - 1), BigInteger.valueOf(1000000007L)).subtract(BigInteger.ONE).mod(BigInteger.valueOf(1000000007L)));
    }
}
