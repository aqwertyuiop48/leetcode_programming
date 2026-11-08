import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            ? Math.max(Math.abs(Integer.parseInt(t[0]) - Integer.parseInt(t[2])), Math.abs(Integer.parseInt(t[1]) - Integer.parseInt(t[3]))) : "");
    }
}
