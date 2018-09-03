package graph_search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class DFS_Example2 {

    public static HashMap<Character, String> createGraph() {
        HashMap<Character, String> map = new HashMap<>();
        map.put('A', "BFH");  // A ������ ������ ���� ��� ���
        map.put('B', "ACEF"); // B ������ ������ ���� ��� ���
        map.put('C', "ABDE");
        map.put('D', "CE");
        map.put('E', "BCD");
        map.put('F', "ABHG");
        map.put('G', "FH");
        map.put('H', "AF");
        return map;
    }

    public static void DFS(HashMap<Character,String> �׷���, char ��������) {
        HashSet<Character> �湮������ = new HashSet<>();
        Stack<Character> �������湮��������� = new Stack<>();
        �湮������.add(��������);
        �������湮���������.push(��������);
        while (�������湮���������.isEmpty() == false) {
            char �������� = �������湮���������.pop();
            System.out.printf("%c ", ��������);
            String ����������� = �׷���.get(��������);
            for (char �������� : �����������.toCharArray())
                if (�湮������.contains(��������) == false) {
                    �湮������.add(��������);
                    �������湮���������.add(��������);
                }
        }
    }

    public static void main(String[] args) {
        DFS(createGraph(), 'A');
    }
}
