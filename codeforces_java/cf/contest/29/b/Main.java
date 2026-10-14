import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(a ->
            Optional.of((double) a[1] / a[2]).ifPresent(t ->
                Optional.of(t % (a[3] + a[4])).ifPresent(phase ->
                    System.out.printf("%.8f%n", phase < a[3] ? (double) a[0] / a[2] : t + (a[3] + a[4] - phase) + (double) (a[0] - a[1]) / a[2])))));
    }
}
