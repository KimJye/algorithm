/*
 * 교수님 답안.
 * WordInfo 클래스와 ArrayList<WordInfo>클래스를 이용하여 단어 목록을 구현하라.
 * 선형 탐색으로 구현하라.
 */
package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Example2 {
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

	static void sortByCountDesc(ArrayList<WordInfo> a) { // WrodInfo 목록을 정렬한다. insertion sort
		for (int i = 1; i < a.size(); ++i) {
			WordInfo value = a.get(i);
			int j;
			for (j = i - 1; j >= 0; --j)
				if (a.get(j).count < value.count) // WordInfo의 count 멤버 변수 값의 내림차순 정렬
					a.set(j + 1, a.get(j));
				else break;
			a.set(j + 1, value);
		}
	}

	static WordInfo findWord(ArrayList<WordInfo> list, String word) { // WordInfo 목록에서 단어를 찾아서 리턴한다
		for (int i = 0; i < list.size(); ++i) {   // 선형 탐색
			System.out.print("선형 탐색 결과: ");
			System.out.println(list.get(i).word);
			if (list.get(i).word.equals(word)) {
				return list.get(i);
			}
		}
		return null;                            // 못찾았으면 null을 리턴한다.
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(텍스트파일));
		ArrayList<WordInfo> a = new ArrayList<WordInfo>(); // WordInfo를 저장할 ArrayList 객체 생성
		String word;
		while ( (word = getWord(reader)) != null) { // 텍스트 파일에서 단어를 하나씩 읽어온다
			word = word.toLowerCase();              // 단어를 소문자로 변환한다
			System.out.print("main에서 소문자로 변환한 값:");
			System.out.println(word);
			WordInfo wordInfo = findWord(a, word); // WordInfo 목록에서 word를 찾는다
			System.out.println("findWord메소드 실행함");
			if (wordInfo != null)
				wordInfo.count++;                  // 찾았으면 ++count
			else
				a.add(new WordInfo(word, 1));   // 못찾았으면 새 단어 등록
		}

		sortByCountDesc(a); // WordInfo 배열을 count 내림차순으로 정렬한다.
		for (int i = 0; i < 10; ++i) // 선두 10 개 단어 출력
		   System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
	}

}
