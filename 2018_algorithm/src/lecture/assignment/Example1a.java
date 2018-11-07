/*
 * ������ ���.
 * Scanner Ŭ���� �̿��Ͽ� �ܾ� �б� ����
 * ���Խ�
 * Arrays.sort �޼ҵ� Ȱ���Ͽ� �迭 ����
 */
package assignment;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class WordInfoComparator1a implements Comparator<WordInfo> {
    @Override
    public int compare(WordInfo w1, WordInfo w2) {
        return w2.count - w1.count; // count �������� ������ ���� ��
    }
}

public class Example1a {
    static final String �ؽ�Ʈ���� = "C:\\Users\\jihye\\Desktop\\text.txt";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(�ؽ�Ʈ����)); // ���Ͽ��� �ܾ �о���� ���� ��ü ����
        scanner.useDelimiter("[^a-zA-Z]+"); // �ܾ��� �Ϻΰ� �ƴ� ���ڸ� ���Խ����� �����Ѵ�.
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // �ܾ�� ����Ƚ���� ����� HashMap��ü ����
        while (scanner.hasNext()) {
            String word = scanner.next();          // ���Ͽ��� �ܾ �ϳ� �о�´�
            word = word.toLowerCase();             // �ܾ �ҹ��ڷ� ��ȯ�Ѵ�
            Integer count = map.get(word);          // �ܾ��� ���� Ƚ���� ���Ѵ�
            if (count == null) count = 1;           // map�� ��ϵ� �ܾ �ƴ϶�� count ���� null �̴�.
            else count = count + 1;                 // map�� ��ϵ� �ܾ��� count ���� 1 ����
            map.put(word, count);                   // map�� �� �ܾ �ٽ� ����Ѵ�
        }
        scanner.close();

        int size = map.size();               // map�� ��ϵ� �ܾ��� ���� ���Ѵ�.
        WordInfo[] a = new WordInfo[size];   // �� �ܾ���� ������ �迭�� �����Ѵ�.
        int index = 0;
        for (String key : map.keySet()) {        // map�� ��ϵ� key ������ ���ؼ� for ������ �ݺ��Ѵ�.
            int count = map.get(key);            // �� map ��ü�� key�� �ܾ��̴�. �� �ܾ��� ���� Ƚ���� ���Ѵ�.
            a[index] = new WordInfo(key, count); // WordInfo ��ü�� �����Ͽ� �迭�� index ��ġ�� ����
            ++index;                             // index �� ����
        }

        Arrays.sort(a, new WordInfoComparator1a()); // WordInfo ����� count ������������ �����Ѵ�.
        for (int i = 0; i < 10; ++i) // ���� 10 �� �ܾ� ���
            System.out.printf("%s %d\n", a[i].word, a[i].count);
    }
}
