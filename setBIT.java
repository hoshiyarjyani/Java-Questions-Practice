public class setBIT {
    public static void main(String args[]){
        int n = 5;//0101
        int position= 1;
        int bitmask = 1<<position;

        int newNo = n | bitmask; //result = 7 (0111))

        System.out.println( newNo);
    }
}
