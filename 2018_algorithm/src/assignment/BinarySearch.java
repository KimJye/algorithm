/*
 * ������ ����
 * WordInfo Ŭ������, ArrayList<WordInfo> Ŭ������ �̿��ؼ� �ܾ� ����� �����϶�.
 * �ܾ� ��Ͽ��� �ܾ ã�� �۾��� ���� Ž������ �����϶�.
 * insertion sort�� �����ϰ� �ٸ� ���� �˰����� ����Ͽ� �����϶�.
 *
 */
package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Comparator;


class WordInfoComparator implements Comparator<WordInfo> {
    public int compare(WordInfo w1, WordInfo w2) {
    	return w1.word.compareTo(w2.word);
    }
}
public class BinarySearch {
	static final String �ؽ�Ʈ���� ="C:\\Users\\jihye\\Desktop\\text.txt";

	static String getWord(Reader reader) throws IOException{
		int ch;
		StringBuilder builder = new StringBuilder();
		while((ch = reader.read())!=-1) {
			if(Character.isAlphabetic(ch)) {
				builder.append((char)ch);
				System.out.print("���ĺ��϶� append �����:");
				System.out.println(builder.toString());
			}else {
				System.out.println("���ĺ� �ƴҋ�!!");
				if(builder.length()>0) {
					System.out.println("ä���� ���ĺ� ���ڰ� �ִٸ�, while�� ��������");
					break;
				}
			}
		}
		if(builder.length()>0) {
			System.out.print("ä���� ���ĺ� ���ڰ� �ִٸ�, �� �ܾ� �����Ѵ�.");
			System.out.println(builder.toString());
			return builder.toString();
		}
		else {
			System.out.println("ä���� ���ĺ� ���ڰ� ���ٸ� null �����Ѵ�.");
			return null;
		}
	}

	static void sortByCountDesc(ArrayList<WordInfo> a) { // WrodInfo ����� �����Ѵ�. insertion sort
		for (int i = 1; i < a.size(); ++i) {
			WordInfo value = a.get(i);
			int j;
			for (j = i - 1; j >= 0; --j)
				if (a.get(j).count < value.count) // WordInfo�� count ��� ���� ���� �������� ����
					a.set(j + 1, a.get(j));
				else break;
			a.set(j + 1, value);
		}
	}

	static int findWord(ArrayList<WordInfo> list, String word, int start, int end) { // WordInfo ��Ͽ��� �ܾ ã�Ƽ� �����Ѵ�
		if(start>end) {
			list.add(new WordInfo(word, 1));
			return start;
		}
	
		int middle =(start+end)/2;
		
		WordInfo com = list.get(middle);
		int compare = com.word.compareTo(word);
		
		if(compare==0) {//�ٷ� ã����
			com.count++;
			return middle;
		}else if(compare<0) {//word�� ������
			return findWord(list, word, start, middle-1);
		}else  if(compare>0) {//word�� Ŭ��
			return findWord(list, word, middle+1, end);
		}
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(�ؽ�Ʈ����));
		ArrayList<WordInfo> a = new ArrayList<WordInfo>(); // WordInfo�� ������ ArrayList ��ü ����
		String word;
		while ( (word = getWord(reader)) != null) { // �ؽ�Ʈ ���Ͽ��� �ܾ �ϳ��� �о�´�
			word = word.toLowerCase();              // �ܾ �ҹ��ڷ� ��ȯ�Ѵ�
			System.out.print("main���� �ҹ��ڷ� ��ȯ�� ��:");
			System.out.println(word);
			findWord(a, word, 0, word.length()); // WordInfo ��Ͽ��� word�� ã�´�
			System.out.println("findWord�޼ҵ� ������");
		
		}

		sortByCountDesc(a); // WordInfo �迭�� count ������������ �����Ѵ�.
		for (int i = 0; i < 10; ++i) // ���� 10 �� �ܾ� ���
		   System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
	}

}
