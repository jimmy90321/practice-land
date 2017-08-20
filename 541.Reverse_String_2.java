
public class Reverse_String_2 {

    public String reverseStr(String s, int k) {
        StringBuilder bfr = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int i = 0;
        int count = 1;
        for (; (i+k) <= s.length(); i += k) {
            bfr.append(s.substring(i, (i + k)));
            if (count % 2 != 0) {
                bfr.reverse();
            }
            result.append(bfr);
            bfr.delete(0, bfr.length());
            count++;
        }
        bfr.append(s.substring(i, s.length()));
        if (count % 2 != 0) {
                bfr.reverse();
            }
        result.append(bfr);
        return result.toString();
    }
}
