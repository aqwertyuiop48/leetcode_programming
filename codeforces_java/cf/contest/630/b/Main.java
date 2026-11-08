public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            ? String.format(java.util.Locale.US, "%.12f", Double.parseDouble(t[0]) * Math.pow(1.000000011, Double.parseDouble(t[1]))) : "");
    }
}
