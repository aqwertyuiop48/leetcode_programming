import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong()}).ifPresent(xy -> Optional.of(xy[0] * xy[0] + xy[1] * xy[1]).ifPresent(d2 -> Optional.of(LongStream.rangeClosed(0, 1415).filter(r -> r * r <= d2).max().getAsLong()).ifPresent(ring -> System.out.print((xy[0] == 0 || xy[1] == 0 || ring * ring == d2) ? "black" : (((ring + (xy[0] > 0 && xy[1] > 0 ? 0 : xy[0] < 0 && xy[1] > 0 ? 1 : xy[0] < 0 && xy[1] < 0 ? 2 : 3)) % 2 == 0) ? "black" : "white"))))));
    }
}



