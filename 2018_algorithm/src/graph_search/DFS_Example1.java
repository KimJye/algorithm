package graph_search;

import java.util.HashMap;
import java.util.HashSet;

public class DFS_Example1 {

    public static HashMap<Character, String> createGraph() {
        HashMap<Character, String> map = new HashMap<>();
        map.put('A', "BFH");  // A ������ ������ ���� ��� ���
        map.put('B', "ACEF"); // B ������ ������ ���� ��� ���
        map.put('C', "BDE");
        map.put('D', "CE");
        map.put('E', "BCD");
        map.put('F', "ABGH");
        map.put('G', "F");
        map.put('H', "AF");
        return map;
    }

    public static void DFS(HashMap<Character,String> �׷���, char ��������) {
        DFS(�׷���, ��������, new HashSet<>());
    }

    static void DFS(HashMap<Character,String> �׷���, char ��������, HashSet<Character> �湮������) {
        �湮������.add(��������);
        System.out.printf("%c ", ��������);
        String ����������� = �׷���.get(��������);
        for (char �������� : �����������.toCharArray())
            if (�湮������.contains(��������) == false)
                DFS(�׷���, ��������, �湮������);
    }

    public static void main(String[] args) {
        DFS(createGraph(), 'A');
    }
}
