package array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Date: 2019. 05. 23
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2751
 * Title : 수 정렬하기2
 * description : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오

                 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
                        이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

                 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

 * solution : 정렬
 *            quick sort : O(nlogn), O(n^2)
 *            merge sort : O(nlogn)
 *            heap sort  : O(nlogn)
 */
public class P2751 {

    // merge sort
    public static void mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;

        // 시간초과
        //List<Integer> left = list.subList(0, mid).stream().collect(Collectors.toList());
        //List<Integer> right = list.subList(mid, list.size()).stream().collect(Collectors.toList());

        List<Integer>  left = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        //left.stream().filter(i->i<mid).forEach(l->left.add(list.remove(0)));
        //right.stream().filter(i->list.size()!=0).forEach(r->right.add(list.remove(0)));

        mergeSort(left);
        mergeSort(right);

        merge(left, right, list);
    }

    // merge
    static void merge(List<Integer> left, List<Integer> right, List<Integer> list) {
        list.clear();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
               list.add(left.get(i++));
            } else {
                list.add(right.get(j++));
            }
        }
        list.addAll(left.subList(i, left.size()));
        list.addAll(right.subList(j, right.size()));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        while (t-- > 0) {
            list.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        mergeSort(list);
        //list.forEach(System.out::println); => 시간초과

        for(int i : list){
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        //heapSort(list);
    }
}
