public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n
            ? (n.longValue() == 1 ? "-1" : n + " " + (n + 1) + " " + n * (n + 1)) : "");
    }
}
