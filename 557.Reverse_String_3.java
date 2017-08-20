
public class Reverse_String_3 {

    public String reverseWords(String s) {
        String[] subString = s.split(" ");
        StringBuilder bfr = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < subString.length; i++) {
            bfr.append(subString[i]);
            sb.append(bfr.reverse());
            bfr.delete(0, bfr.length());
            if (i != subString.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
