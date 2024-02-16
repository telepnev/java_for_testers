public class HellWorld {
    public static void main(String[] args) {
        var x = 1;
        var y = 2;
        if (y == 0) {
            System.out.println("Division by zero is not allowed!");
        } else {
            int z = dived(x, y);
            System.out.println(z);
        }
    }

    private static int dived(int x, int y) {
        var z = x / y;
        return z;
    }
}
