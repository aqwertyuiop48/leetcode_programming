import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[1]) instanceof Integer k
            && tk[2] instanceof String s
            && Integer.valueOf(Math.min(s.indexOf('G'), s.indexOf('T'))) instanceof Integer lo
            && Integer.valueOf(Math.abs(s.indexOf('G') - s.indexOf('T'))) instanceof Integer d
            && d % k == 0 && IntStream.rangeClosed(1, d / k).allMatch(j -> s.charAt(lo + j * k) != '#')
            ? "YES" : "NO");
    }
}
