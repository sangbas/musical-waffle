public class Main {

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 2)); // Output: 5
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Operasi pembagian selesai.");
        }
    } 
}
