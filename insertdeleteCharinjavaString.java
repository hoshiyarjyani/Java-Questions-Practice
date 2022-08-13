//Delete char at some Index

public class insertdeleteCharinjavaString {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("tony");
     //Insert char
     sb.insert(0, 'S');
     System.out.println(sb);
 
	//delete char
     sb.delete(0, 1);
     System.out.println(sb);
   }
}
