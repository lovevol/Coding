import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lh
 * on 2017/5/19.
 */
public class Code18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = 0;
        while (in.hasNext()) {
            length = in.nextInt();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < length*3; i++) {
                list.add(in.nextInt());
            }
            System.out.println(count(list));
        }
    }
    private static int count(List<Integer> X){
        quickSort(X);
        int sum = 0;
        for (int i = X.size()/3; i < 2*X.size()/3; i++)
            sum+=X.get(i);
        return sum;
    }
    private static void quickSort(List<Integer> x){
        if (x.size()>1){
            List<Integer> smaller = new ArrayList<>();
            List<Integer> same = new ArrayList<>();
            List<Integer> larger = new ArrayList<>();
            Integer chooseItem = x.get(x.size()/2);
            for (Integer i:x){
                if (i<chooseItem)
                    smaller.add(i);
                else if (i > chooseItem)
                    larger.add(i);
                else
                    same.add(i);
            }
            quickSort(smaller);
            quickSort(larger);

            x.clear();
            x.addAll(smaller);
            x.addAll(same);
            x.addAll(larger);
        }
    }
}
