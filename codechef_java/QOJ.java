import java.util.*;
import java.math.*;

class Main {
    static void solve(BigInteger n) {
        BigInteger dist = BigInteger.ONE;
        List<BigInteger[]> xd = new ArrayList<>();
        int licz = 0;

        while(n.signum() > 0) {
            BigInteger x = BigInteger.ZERO, y = BigInteger.ZERO;

            if(licz < 2 || licz == 7) x = dist;
            if(licz > 2 && licz < 6) x = dist.negate();
            if(licz > 0 && licz < 4) y = dist;
            if(licz > 4) y = dist.negate();

            if(n.testBit(0)) xd.add(new BigInteger[]{x, y});
            else if(!xd.isEmpty() && xd.get(xd.size()-1).length == 2)
                xd.add(new BigInteger[0]);

            n = n.shiftRight(1);
            licz = (licz + 1) % 8;
            if(licz % 2 == 0) dist = dist.shiftLeft(1);
        }

        BigInteger x = BigInteger.ZERO, y = BigInteger.ZERO;
        int flip = 1, flip2 = -1;

        Collections.reverse(xd);

        for(BigInteger[] i : xd) {
            if(i.length == 0) {
                flip2 *= -1;
                continue;
            }
            x = x.add(i[0].multiply(BigInteger.valueOf(flip)));
            y = y.add(i[1].multiply(BigInteger.valueOf(flip)));
            flip = flip2;
        }

        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(new BigInteger(sc.next()));
    }
}