public class clearBits {
    public static void main(String args[]) {
 int n = 5;  //0101
 int position = 2;
 int bitmask = 1<<position;
         int notbitMask = ~(bitmask); // 0100 convrt to 1011
        int newNo = notbitMask & n;  // 0001
         System.out.println(newNo);  
    }
}
