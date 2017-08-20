
import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies {

    public int distributeCandies(int[] candies) {
        Set kinds = new HashSet();
        int count = 0;

        for (int kind : candies) {
            kinds.add(kind);
        }

        if (kinds.size() >= (candies.length / 2)) {
            count = (candies.length / 2);
        } else {
            count = kinds.size();
        }
        return count;
    }
}
