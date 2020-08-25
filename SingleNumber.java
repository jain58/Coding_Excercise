import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> m;
        m = new HashMap<Integer, Integer>();
        for (int j : nums) {
            if (m.containsKey(j)) {
                int value = m.get(j);
                m.put(j, value + 1);
            } else {
                m.put(j, 1);
            }
        }
        for (int num : nums) {
            if (m.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        SingleNumber singleNumber = new SingleNumber();
        int [] nums = {6, 6, 7, 7, 8, 8, 9, 9, 14, 14, 19, 5, 5};
        System.out.println(singleNumber.singleNumber(nums));
    }

}

