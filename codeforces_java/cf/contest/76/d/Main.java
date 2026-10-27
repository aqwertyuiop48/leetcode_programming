import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner in
            && new BigInteger(in.next()) instanceof BigInteger sum
            && new BigInteger(in.next()) instanceof BigInteger xr
            && sum.subtract(xr) instanceof BigInteger diff
            && diff.shiftRight(1) instanceof BigInteger half
            ? (diff.signum() >= 0 && !diff.testBit(0) && half.and(xr).signum() == 0
                ? half + " " + half.or(xr)
                : "-1")
            : "");
    }
}

