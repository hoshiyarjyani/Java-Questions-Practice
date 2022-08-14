public class GetBIT {
    public static void main(String arga[]) {
        int n = 5;
        int position = 2;
        int bitmask = 1 << position;
        if ((n & bitmask) == 0) {
            System.out.println("value is 0");
        } else {
            System.out.println("value is 1");
        }
    }
}
