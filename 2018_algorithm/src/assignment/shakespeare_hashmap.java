/*
 * HashMap 클래스를 이용하여 구현하라.

 * shakespeare.txt 파일에서 영어 단어를 읽어서 각 단어의 출현 횟수를 세어라. 

먼저 shakespeare.txt 파일에서 읽은 총 단어 수를 출력하라. 

그리고 출현 횟수가 높은 단어 10개를 화면에 출력하라. 

출력에는 각 단어의 출현 횟수가 포함되어야 한다. 

영어 알파벳이 모여있는 것이 단어이다. 

단어를 비교할 때 대소문자를 구별하지 않아야 한다. 즉 The와 the는 같은 단어이다.

 */


package assignment;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class shakespeare_hashmap {

    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = new HashMap<String,Integer>();
        String filePath = "C:/Users/jihye/Desktop/shakespeare.txt";
        Scanner scanner = new Scanner(Paths.get(filePath));
        scanner.useDelimiter("[^a-zA-Z]+");
        int result=0;
        while (scanner.hasNext("[a-zA-Z]+")) {
            String s = scanner.next();
            Integer count = map.get(s);
            if (count == null) count = 0;
            count = count + 1;
            result+=count;
            map.put(s, count);
        }
        scanner.close();
        
        System.out.printf("총 단어 수: %d",result);
        System.out.println();
        
        for (String s : map.keySet())
            System.out.printf("%s %d\n", s, map.get(s));
    }
}

