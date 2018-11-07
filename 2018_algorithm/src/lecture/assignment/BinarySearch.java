/*
 * 스스로 구현
 * WordInfo 클래스와, ArrayList<WordInfo> 클래스를 이용해서 단어 목록을 구현하라.
 * 단어 목록에서 단어를 찾는 작업을 이진 탐색으로 구현하라.
 * insertion sort를 제외하고 다른 정렬 알고리즘을 사용하여 구현하라.
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
	static final String 텍스트파일 ="C:\\Users\\jihye\\Desktop\\text.txt";

	static String getWord(Reader reader) throws IOException{
		int ch;
		StringBuilder builder = new StringBuilder();
		while((ch = reader.read())!=-1) {
			if(Character.isAlphabetic(ch)) {
				builder.append((char)ch);
				System.out.print("알파벳일때 append 결과값:");
				System.out.println(builder.toString());
			}else {
				System.out.println("알파벳 아닐떄!!");
				if(builder.length()>0) {
					System.out.println("채워진 알파벳 문자가 있다면, while문 빠져나감");
					break;
				}
			}

		}
		if(builder.length()>0) {
			System.out.print("채워진 알파벳 문자가 있다면, 그 단어 리턴한다.");
			System.out.println(builder.toString());
			return builder.toString();
		}
		else {
			System.out.println("채워진 알파벳 문자가 없다면 null 리턴한다.");
			return null;
		}
	}

	public static WordInfo findWord(ArrayList<WordInfo> list, String word) { // WordInfo 목록에서 단어를 찾아서 리턴한다
		int start=0;
		int end=list.size()-1;
		WordInfoComparatorByWord byword = new  WordInfoComparatorByWord();
		Collections.sort(list,byword);
		while(start<=end) {
		
			
			int middle =(start+end)/2;

			WordInfo com = list.get(middle);

			int compare = com.word.compareTo(word);

			if(compare==0) {//바로 찾으면
				System.out.println("찾았따!!");
				return list.get(middle);
			}else if(compare<0) {//word가 작을때
				start = middle+1;

			}else  if(compare>0) {//word가 클때
				end = middle-1;
			}
		}
		return null;

	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(텍스트파일));

		ArrayList<WordInfo> a = new ArrayList<WordInfo>(); // WordInfo를 저장할 ArrayList 객체 생성

		WordInfoComparatorByWord byword = new  WordInfoComparatorByWord();
		WordInfoComparatorByCount bycount = new  WordInfoComparatorByCount();

		String word;

		while ( (word = getWord(reader)) != null) { // 텍스트 파일에서 단어를 하나씩 읽어온다
			word = word.toLowerCase();              // 단어를 소문자로 변환한다
			System.out.print("main에서 소문자로 변환한 값:");
			System.out.println(word);

			WordInfo wordInfo = findWord(a,word); // WordInfo 목록에서 word를 찾는다
			System.out.println("findWord메소드 실행함");
			if (wordInfo != null) {
				wordInfo.count++; // 찾았으면 ++count 
				System.out.println("증가함");
			}else {                 
				a.add(new WordInfo(word, 1));   // 못찾았으면 새 단어 등록
				Collections.sort(a,byword);
			}
		}

		Collections.sort(a,bycount); // WordInfo 배열을 count 내림차순으로 정렬한다.

		for (int i = 0; i < 10; ++i) // 선두 10 개 단어 출력
			System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
	}

}
