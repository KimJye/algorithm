/*
 * 교수님 답안.
 * Lambda Expression 문법을 활용하여 Comparator 객체 구현
 * Generic Type 생략함.
 */
package assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Example1d {
    static final String 텍스트파일 = "C:\\Users\\jihye\\Desktop\\text.txt";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(텍스트파일)); // 파일에서 단어를 읽어오기 위한 객체 생성
        scanner.useDelimiter("[^a-zA-Z]+"); // 단어의 일부가 아닌 문자를 정규식으로 설정한다.
        HashMap<String, Integer> map = new HashMap<>(); // 단어와 출현횟수를 등록할 HashMap객체 생성
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();   // 파일에서 단어를 하나 읽어서 소문자로 변환한다.
            Integer count = map.get(word);                 // 단어의 출현 횟수를 구한다
            map.put(word, count == null ? 1 : count + 1);
        }
        scanner.close();

        ArrayList<WordInfo> a = new ArrayList<>();  // 그 단어들을 저장할 객체 생성한다.
        for (String key : map.keySet())
            a.add(new WordInfo(key, map.get(key)));

        Collections.sort(a, (w1, w2) -> w2.count - w1.count); // WordInfo 목록을 count 내림차순으로 정렬한다.
        for (int i = 0; i < 10; ++i) // 선두 10 개 단어 출력
            System.out.printf("%s %d\n", a.get(i).word, a.get(i).count);
    }
}
