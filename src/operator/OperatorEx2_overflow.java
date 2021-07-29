package operator;

public class OperatorEx2_overflow {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 2000000;
        long l = 2000000l;
        long c = a * (long) b;  // 하는 형변환이 필요함
        long d = a * l;
        System.out.println(c);
        System.out.println(d);
    }
}
