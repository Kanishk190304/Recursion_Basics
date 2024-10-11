import java.util.*;
public class SubsetsOfAnArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        findSubsets(arr, 0, new ArrayList<>(), result);

        for(List<Integer> subset : result){
            System.out.println(subset);
        }
    }

    public static void findSubsets(int[] arr, int i, List<Integer> current, List<List<Integer>> result){
        if(i == arr.length){
            result.add(new ArrayList<>(current));
            return;
        }

        findSubsets(arr, i+1, current, result);

        current.add(arr[i]);
        findSubsets(arr, i+1, current, result);

        current.remove(current.size()-1);
    }
}
