/*
 * ������ ���
 * Annoymous Inner Class ����Ȱ���Ͽ� Comparator ��ü ����
 */
package assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Example1c {
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

        ArrayList<WordInfo> a = new ArrayList<>();  // �� �ܾ���� ������ ��ü �����Ѵ�.
        for (String key : map.keySet())
            a.add(new WordInfo(key, map.get(key)));

        Collections.sort(a, new Comparator<WordInfo>() {
            @Override
            public int compare(WordInfo w1, WordInfo w2) {
                return w2.count - w1.count;
            }
        }); // WordInfo ����� count ������������ �����Ѵ�.
        for (int i = 0; i < 10; ++i) // ���� 10 �� �ܾ� ���
            System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
    }
}

