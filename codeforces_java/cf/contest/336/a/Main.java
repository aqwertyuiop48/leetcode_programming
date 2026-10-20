import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer x && Integer.valueOf(s.nextInt()) instanceof Integer y
            && Integer.valueOf(Math.abs(x) + Math.abs(y)) instanceof Integer t
            ? x < 0 ? (-t) + " 0 0 " + (y < 0 ? -t : t) : "0 " + (y < 0 ? -t : t) + " " + t + " 0" : "");
    }
}
