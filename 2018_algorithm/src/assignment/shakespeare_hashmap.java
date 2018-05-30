/*
 * HashMap Ŭ������ �̿��Ͽ� �����϶�.

 * shakespeare.txt ���Ͽ��� ���� �ܾ �о �� �ܾ��� ���� Ƚ���� �����. 

���� shakespeare.txt ���Ͽ��� ���� �� �ܾ� ���� ����϶�. 

�׸��� ���� Ƚ���� ���� �ܾ� 10���� ȭ�鿡 ����϶�. 

��¿��� �� �ܾ��� ���� Ƚ���� ���ԵǾ�� �Ѵ�. 

���� ���ĺ��� ���ִ� ���� �ܾ��̴�. 

�ܾ ���� �� ��ҹ��ڸ� �������� �ʾƾ� �Ѵ�. �� The�� the�� ���� �ܾ��̴�.

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
        
        System.out.printf("�� �ܾ� ��: %d",result);
        System.out.println();
        
        for (String s : map.keySet())
            System.out.printf("%s %d\n", s, map.get(s));
    }
}

