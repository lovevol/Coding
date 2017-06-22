import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lh
 * on 2017/5/18.
 */
/*
题目描述
春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
若没有金额超过总数的一半，返回0。
测试样例：
[1,2,3,2,2],5
返回：2
* */
public class Code16 {
    public static void main(String[] args){

    }
    public int getValue(int[] gifts, int n) {
        // write code here
        List<Integer> g = new LinkedList<Integer>();
        for (int i:gifts)
            g.add(i);
        quickSort(g);
        int number = n/2;
        int count = 0;
        int temp = g.get(0);
        for (int i:g){
            if (i==temp){
                count++;
                if (count > number)
                    return i;
            }else
                temp = i;
        }
        return 0;
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
