/*
 * 교수님 답안.
 * Scanner 클래스 이용하여 단어 읽기 구현
 * 정규식
 * Arrays.sort 메소드 활용하여 배열 정렬
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
        return w2.count - w1.count; // count 내림차순 정렬을 위한 비교
    }
}

public class Example1a {
    static final String 텍스트파일 = "C:\\Users\\jihye\\Desktop\\text.txt";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(텍스트파일)); // 파일에서 단어를 읽어오기 위한 객체 생성
        scanner.useDelimiter("[^a-zA-Z]+"); // 단어의 일부가 아닌 문자를 정규식으로 설정한다.
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // 단어와 출현횟수를 등록할 HashMap객체 생성
        while (scanner.hasNext()) {
            String word = scanner.next();          // 파일에서 단어를 하나 읽어온다
            word = word.toLowerCase();             // 단어를 소문자로 변환한다
            Integer count = map.get(word);          // 단어의 출현 횟수를 구한다
            if (count == null) count = 1;           // map에 등록된 단어가 아니라면 count 값이 null 이다.
            else count = count + 1;                 // map에 등록된 단어라면 count 값을 1 증가
            map.put(word, count);                   // map에 그 단어를 다시 등록한다
        }
        scanner.close();

        int size = map.size();               // map에 등록된 단어의 수를 구한다.
        WordInfo[] a = new WordInfo[size];   // 그 단어들을 저장할 배열을 생성한다.
        int index = 0;
        for (String key : map.keySet()) {        // map에 등록된 key 각각에 대해서 for 루프를 반복한다.
            int count = map.get(key);            // 이 map 객체의 key는 단어이다. 그 단어의 출현 횟수를 구한다.
            a[index] = new WordInfo(key, count); // WordInfo 객체를 생성하여 배열의 index 위치에 저장
            ++index;                             // index 값 증가
        }

        Arrays.sort(a, new WordInfoComparator1a()); // WordInfo 목록을 count 내림차순으로 정렬한다.
        for (int i = 0; i < 10; ++i) // 선두 10 개 단어 출력
            System.out.printf("%s %d\n", a[i].word, a[i].count);
    }
}
