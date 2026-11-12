public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(t[1]) instanceof Long k
            ? (n / k + 1) * k : "");
    }
}
