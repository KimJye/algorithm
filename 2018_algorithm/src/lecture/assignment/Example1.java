package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

public class Example1 {
    static final String 텍스트파일 = "C:\\\\Users\\\\jihye\\\\Desktop\\\\text.txt";

    static String getWord(Reader reader) throws IOException { // 텍스트 파일에서 단어를 하나씩 읽어서 리턴한다
        int ch;
        StringBuilder builder = new StringBuilder();  // 알파벳 문자 하나씩 추가하여 단어를 생성할 객체
        while ((ch = reader.read()) != -1) {  // 파일에서 문자를 하나씩 읽는다. 읽은 문자가 -1 이면 파일의 끝이다.
            if (Character.isAlphabetic(ch))   // 읽은 문자가 알파벳이면
                builder.append((char)ch);     // 문자를 단어에 추가한다
            else                                 // 읽은 문자가 알파벳이 아니면
                if (builder.length() > 0) break; // 채워진 알파벳 문자가 있다면, 그 단어를 리턴하기 위해 break 한다
        }
        if (builder.length() > 0) return builder.toString(); // 채워진 알파벳 문자가 있다면, 그 단어를 리턴한다.
        else return null; // 채워진 알파벳 문자가 없다면, null을 리턴한다. 파일의 끝에서 null을 리턴하게 된다.
    }

    static void sortByCountDesc(WordInfo[] a) {   // WrodInfo 배열을 정렬한다. insertion sort
        for (int i = 1; i < a.length; ++i) {
            WordInfo value = a[i];
            int j;
            for (j = i - 1; j >= 0; --j)
                if (a[j].count < value.count) // WordInfo의 count 멤버 변수 값의 내림차순 정렬
                    a[j + 1] = a[j];
                else
                    break;
            a[j + 1] = value;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(텍스트파일));
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // 단어와 출현횟수를 등록할 HashMap객체 생성
        String word;
        while ( (word = getWord(reader)) != null) { // 텍스트 파일에서 단어를 하나씩 읽어온다
            word = word.toLowerCase();              // 단어를 소문자로 변환한다
            Integer count = map.get(word);          // 단어의 출현 횟수를 구한다
            if (count == null) count = 1;           // map에 등록된 단어가 아니라면 count 값이 null 이다.
            else count = count + 1;                 // map에 등록된 단어라면 count 값을 1 증가
            map.put(word, count);                   // map에 그 단어를 다시 등록한다
        }

        int size = map.size();               // map에 등록된 단어의 수를 구한다.
        WordInfo[] a = new WordInfo[size];   // 그 단어들을 저장할 배열을 생성한다.
        int index = 0;
        for (String key : map.keySet()) {        // map에 등록된 key 각각에 대해서 for 루프를 반복한다.
            int count = map.get(key);            // 이 map 객체의 key는 단어이다. 그 단어의 출현 횟수를 구한다.
            a[index] = new WordInfo(key, count); // WordInfo 객체를 생성하여 배열의 index 위치에 저장
            ++index;                             // index 값 증가
        }

        sortByCountDesc(a); // WordInfo 배열을 count 내림차순으로 정렬한다.
        for (int i = 0; i < 10; ++i) // 선두 10 개 단어 출력
            System.out.printf("%s %d\n", a[i].word, a[i].count);
    }
}
