import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combination-sum/submissions/1166888847/
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int[] sortedCandidates = candidates.clone(); // Клонируем массив, чтобы не изменять оригинальный
        sortArray(sortedCandidates); // Сортируем кандидатов

        findCombinations(sortedCandidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinations(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);
            findCombinations(candidates, target - candidates[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Обмен значениями, чтобы отсортировать по возрастанию
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}