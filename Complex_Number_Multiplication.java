
public class Complex_Number_Multiplication {
public String complexNumberMultiply(String a, String b) {
        String a1str = a.substring(0,a.indexOf("+"));
        int a1 = Integer.valueOf(a1str);
        String a2str = a.substring(a.indexOf("+")+1,a.length()-1);
        int a2 = Integer.valueOf(a2str);
        String b1str = b.substring(0,b.indexOf("+"));
        int b1 = Integer.valueOf(b1str);
        String b2str = b.substring(b.indexOf("+")+1,b.length()-1);
        int b2 = Integer.valueOf(b2str);
        return ((a1*b1)-(a2*b2))+"+"+((a1*b2)+(a2*b1))+"i";
    }
}
