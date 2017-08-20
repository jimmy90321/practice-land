
public class Number_Complement {

    public int findComplement(int num) {
        int compare = 1;
        while (num > compare) {
            compare <<= 1;
            compare |= 1;
        }
        return num ^ compare;
    }
}
