/*
 * 교수님 답안
 * Annoymous Inner Class 문법활용하여 Comparator 객체 구현
 */
package assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Example1c {
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

        ArrayList<WordInfo> a = new ArrayList<>();  // 그 단어들을 저장할 객체 생성한다.
        for (String key : map.keySet())
            a.add(new WordInfo(key, map.get(key)));

        Collections.sort(a, new Comparator<WordInfo>() {
            @Override
            public int compare(WordInfo w1, WordInfo w2) {
                return w2.count - w1.count;
            }
        }); // WordInfo 목록을 count 내림차순으로 정렬한다.
        for (int i = 0; i < 10; ++i) // 선두 10 개 단어 출력
            System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
    }
}

