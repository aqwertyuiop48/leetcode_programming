import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next().split(":") instanceof String[] t
            && Integer.valueOf(Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]) + sc.nextInt()) instanceof Integer s
            ? String.format("%02d:%02d", s / 60 % 24, s % 60) : "");
    }
}
