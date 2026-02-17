import java.util.Collection;
import java.util.ArrayList;
class Solution {
    public int[] plusOne(int[] digits) {
       ArrayList<Integer> arr = new ArrayList<>();
    int carry = 1;

    for (int i = digits.length - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        
        if (sum < 10) {
            arr.add(sum);
            carry = 0;
        } else {
            arr.add(0);
            carry = 1;
        }
    }

    if (carry == 1) {
        arr.add(1);
    }

    Collections.reverse(arr);

    int[] result = new int[arr.size()];
    for (int i = 0; i < result.length; i++) {
        result[i] = arr.get(i);
    }

    return result;
    }
}
