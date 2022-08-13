public class ReverseStringValue {
    public static void main(String args[]){

        StringBuilder text = new StringBuilder("Hoshiyar");

       for(int i = 0; i< text.length()/2; i++ ){
        int front = i;
        int last = text.length()-1-i;

        char frontchar = text.charAt(front);
        char lastchar = text.charAt(last);

        text.setCharAt(front, lastchar);
        text.setCharAt(last, frontchar);
       }
       System.out.println(text);
    }
}
