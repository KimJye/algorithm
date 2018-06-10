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
import java.util.Collections;
import java.util.Comparator;


class WordInfoComparatorByWord implements Comparator<WordInfo> {
	@Override
	public int compare(WordInfo w1, WordInfo w2) {
		return w1.word.compareTo(w2.word);
	}
}
class WordInfoComparatorByCount implements Comparator<WordInfo>{
	@Override
	public int compare(WordInfo c1, WordInfo c2) {
		return c2.count-c1.count;
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

	public static WordInfo findWord(ArrayList<WordInfo> list, String word) { // WordInfo ��Ͽ��� �ܾ ã�Ƽ� �����Ѵ�
		int start=0;
		int end=list.size()-1;
		WordInfoComparatorByWord byword = new  WordInfoComparatorByWord();
		Collections.sort(list,byword);
		while(start<=end) {
		
			
			int middle =(start+end)/2;

			WordInfo com = list.get(middle);

			int compare = com.word.compareTo(word);

			if(compare==0) {//�ٷ� ã����
				System.out.println("ã�ҵ�!!");
				return list.get(middle);
			}else if(compare<0) {//word�� ������
				start = middle+1;

			}else  if(compare>0) {//word�� Ŭ��
				end = middle-1;
			}
		}
		return null;

	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(�ؽ�Ʈ����));

		ArrayList<WordInfo> a = new ArrayList<WordInfo>(); // WordInfo�� ������ ArrayList ��ü ����

		WordInfoComparatorByWord byword = new  WordInfoComparatorByWord();
		WordInfoComparatorByCount bycount = new  WordInfoComparatorByCount();

		String word;

		while ( (word = getWord(reader)) != null) { // �ؽ�Ʈ ���Ͽ��� �ܾ �ϳ��� �о�´�
			word = word.toLowerCase();              // �ܾ �ҹ��ڷ� ��ȯ�Ѵ�
			System.out.print("main���� �ҹ��ڷ� ��ȯ�� ��:");
			System.out.println(word);

			WordInfo wordInfo = findWord(a,word); // WordInfo ��Ͽ��� word�� ã�´�
			System.out.println("findWord�޼ҵ� ������");
			if (wordInfo != null) {
				wordInfo.count++; // ã������ ++count 
				System.out.println("������");
			}else {                 
				a.add(new WordInfo(word, 1));   // ��ã������ �� �ܾ� ���
				Collections.sort(a,byword);
			}
		}

		Collections.sort(a,bycount); // WordInfo �迭�� count ������������ �����Ѵ�.

		for (int i = 0; i < 10; ++i) // ���� 10 �� �ܾ� ���
			System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
	}

}
