//only print reverse ... value remain same

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hoshiyar");
        System.out.println(text);

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
