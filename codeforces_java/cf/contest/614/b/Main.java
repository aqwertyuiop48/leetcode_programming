import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && (Boolean) Arrays.stream(t).skip(1).anyMatch(x -> x.equals("0")) instanceof Boolean zero
            && Arrays.stream(t).skip(1).filter(x -> !(x.charAt(0) == '1' && x.chars().skip(1).allMatch(ch -> ch == '0'))).findFirst().orElse("1") instanceof String base
            && (Integer) Arrays.stream(t).skip(1).filter(x -> x.charAt(0) == 49 && x.chars().skip(1).allMatch(ch -> ch == 48)).mapToInt(x -> x.length() - 1).sum() instanceof Integer zeros
            ? (zero ? "0" : base + "0".repeat(zeros)) : "");
    }
}
