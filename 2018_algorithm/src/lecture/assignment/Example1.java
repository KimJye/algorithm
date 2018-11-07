package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

public class Example1 {
    static final String �ؽ�Ʈ���� = "C:\\\\Users\\\\jihye\\\\Desktop\\\\text.txt";

    static String getWord(Reader reader) throws IOException { // �ؽ�Ʈ ���Ͽ��� �ܾ �ϳ��� �о �����Ѵ�
        int ch;
        StringBuilder builder = new StringBuilder();  // ���ĺ� ���� �ϳ��� �߰��Ͽ� �ܾ ������ ��ü
        while ((ch = reader.read()) != -1) {  // ���Ͽ��� ���ڸ� �ϳ��� �д´�. ���� ���ڰ� -1 �̸� ������ ���̴�.
            if (Character.isAlphabetic(ch))   // ���� ���ڰ� ���ĺ��̸�
                builder.append((char)ch);     // ���ڸ� �ܾ �߰��Ѵ�
            else                                 // ���� ���ڰ� ���ĺ��� �ƴϸ�
                if (builder.length() > 0) break; // ä���� ���ĺ� ���ڰ� �ִٸ�, �� �ܾ �����ϱ� ���� break �Ѵ�
        }
        if (builder.length() > 0) return builder.toString(); // ä���� ���ĺ� ���ڰ� �ִٸ�, �� �ܾ �����Ѵ�.
        else return null; // ä���� ���ĺ� ���ڰ� ���ٸ�, null�� �����Ѵ�. ������ ������ null�� �����ϰ� �ȴ�.
    }

    static void sortByCountDesc(WordInfo[] a) {   // WrodInfo �迭�� �����Ѵ�. insertion sort
        for (int i = 1; i < a.length; ++i) {
            WordInfo value = a[i];
            int j;
            for (j = i - 1; j >= 0; --j)
                if (a[j].count < value.count) // WordInfo�� count ��� ���� ���� �������� ����
                    a[j + 1] = a[j];
                else
                    break;
            a[j + 1] = value;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(�ؽ�Ʈ����));
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // �ܾ�� ����Ƚ���� ����� HashMap��ü ����
        String word;
        while ( (word = getWord(reader)) != null) { // �ؽ�Ʈ ���Ͽ��� �ܾ �ϳ��� �о�´�
            word = word.toLowerCase();              // �ܾ �ҹ��ڷ� ��ȯ�Ѵ�
            Integer count = map.get(word);          // �ܾ��� ���� Ƚ���� ���Ѵ�
            if (count == null) count = 1;           // map�� ��ϵ� �ܾ �ƴ϶�� count ���� null �̴�.
            else count = count + 1;                 // map�� ��ϵ� �ܾ��� count ���� 1 ����
            map.put(word, count);                   // map�� �� �ܾ �ٽ� ����Ѵ�
        }

        int size = map.size();               // map�� ��ϵ� �ܾ��� ���� ���Ѵ�.
        WordInfo[] a = new WordInfo[size];   // �� �ܾ���� ������ �迭�� �����Ѵ�.
        int index = 0;
        for (String key : map.keySet()) {        // map�� ��ϵ� key ������ ���ؼ� for ������ �ݺ��Ѵ�.
            int count = map.get(key);            // �� map ��ü�� key�� �ܾ��̴�. �� �ܾ��� ���� Ƚ���� ���Ѵ�.
            a[index] = new WordInfo(key, count); // WordInfo ��ü�� �����Ͽ� �迭�� index ��ġ�� ����
            ++index;                             // index �� ����
        }

        sortByCountDesc(a); // WordInfo �迭�� count ������������ �����Ѵ�.
        for (int i = 0; i < 10; ++i) // ���� 10 �� �ܾ� ���
            System.out.printf("%s %d\n", a[i].word, a[i].count);
    }
}
