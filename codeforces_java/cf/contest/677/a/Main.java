import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[1]) instanceof Integer h
            ? IntStream.range(2, t.length).map(i -> Integer.parseInt(t[i]) > h ? 2 : 1).sum() : "");
    }
}
