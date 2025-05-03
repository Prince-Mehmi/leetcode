import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            int currDiff = arr[i] - arr[i - 1];
            if (currDiff < diff) {
                output.clear();
                diff = currDiff;
            }
            if (currDiff == diff) {
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                output.add(pair);
            }
        }

        return output;
    }

    public static void main(String[] var0) {
        System.out.println(minimumAbsDifference(new int[]{4,2,1,3}));
        System.out.println(minimumAbsDifference(new int[]{1,3,6,10,15}));
        System.out.println(minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }
}
