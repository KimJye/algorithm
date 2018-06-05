/*
 * ������ ���.
 * Lambda Expression ������ Ȱ���Ͽ� Comparator ��ü ����
 * Generic Type ������.
 */
package assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Example1d {
    static final String �ؽ�Ʈ���� = "C:\\Users\\jihye\\Desktop\\text.txt";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(�ؽ�Ʈ����)); // ���Ͽ��� �ܾ �о���� ���� ��ü ����
        scanner.useDelimiter("[^a-zA-Z]+"); // �ܾ��� �Ϻΰ� �ƴ� ���ڸ� ���Խ����� �����Ѵ�.
        HashMap<String, Integer> map = new HashMap<>(); // �ܾ�� ����Ƚ���� ����� HashMap��ü ����
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();   // ���Ͽ��� �ܾ �ϳ� �о �ҹ��ڷ� ��ȯ�Ѵ�.
            Integer count = map.get(word);                 // �ܾ��� ���� Ƚ���� ���Ѵ�
            map.put(word, count == null ? 1 : count + 1);
        }
        scanner.close();

        ArrayList<WordInfo> a = new ArrayList<>();  // �� �ܾ���� ������ ��ü �����Ѵ�.
        for (String key : map.keySet())
            a.add(new WordInfo(key, map.get(key)));

        Collections.sort(a, (w1, w2) -> w2.count - w1.count); // WordInfo ����� count ������������ �����Ѵ�.
        for (int i = 0; i < 10; ++i) // ���� 10 �� �ܾ� ���
            System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
    }
}
