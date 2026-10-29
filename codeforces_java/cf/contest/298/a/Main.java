import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s
            && Integer.valueOf(s.indexOf('R') + 1) instanceof Integer fr && Integer.valueOf(s.lastIndexOf('R') + 1) instanceof Integer lr && Integer.valueOf(s.indexOf('L') + 1) instanceof Integer fl && Integer.valueOf(s.lastIndexOf('L') + 1) instanceof Integer ll
            ? fl == 0 ? fr + " " + (lr + 1) : fr == 0 ? ll + " " + (fl - 1) : fr + " " + lr : "");
    }
}

