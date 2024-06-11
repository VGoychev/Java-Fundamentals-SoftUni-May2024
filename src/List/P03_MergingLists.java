package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(first.size(),second.size()); i++) {
                result.add(first.get(i));
                result.add(second.get(i));
        }
        if (first.size()>second.size()){
            result.addAll(getRemainingElements(first,second));
        } else if (second.size() > first.size()) {
            result.addAll(getRemainingElements(second,first));
        }
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
    public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> nums = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add(longerList.get(i));
        }
        return nums;
    }
}
