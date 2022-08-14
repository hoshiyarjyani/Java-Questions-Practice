public class updateBit {
    public static void main(String args[]) {
       
       //set bit mask for 1
        int n = 5; //0101
       int position = 1;
       int bitmask = 1<<position;//0010
       int newno = n | bitmask;// 0111 result   // set 1 bnane k liye
       System.out.println(newno);
  
      // clear bit mask  for 0
       int k = 5; //0101
       int pos = 2;
       int btmask = 1<<pos; // 0100
       int negtivebitmask = ~(btmask); //1011   // clear -- 0 bnane k liye
       int nonew =  k & negtivebitmask; // result 0001
       System.out.println(nonew);
}
}