import java.util.*;

public class CompetativePro {

    public int CountCommonFactor(int[] list) {
        int count = 0;
        ArrayList<Integer> prev = new ArrayList<>();
        ArrayList<Integer> next = new ArrayList<>();

        prev = Factor(list[0]);

        for (int a = 1; a < list.length; a++) {
            next = Factor(list[a]);
            for (int i = 0; i < prev.size(); i++) {
                for (int j = 0; j < next.size(); j++) {
                    if (prev.get(i) == next.get(j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public ArrayList Factor(int data) {
        ArrayList<Integer> Arr = new ArrayList<>();
        for (int i = 1; i <= data; i++) {
            if (data % i == 0) {
                Arr.add(i);
            }
        }
        return Arr;
    }

    public static void main(String[] args) {
        CompetativePro cp = new CompetativePro();
        int[] arr = { 10, 15};
        System.out.println(cp.CountCommonFactor(arr));

    }
}
