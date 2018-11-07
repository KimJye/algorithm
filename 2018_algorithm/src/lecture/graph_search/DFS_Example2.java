package graph_search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class DFS_Example2 {

    public static HashMap<Character, String> createGraph() {
        HashMap<Character, String> map = new HashMap<>();
        map.put('A', "BFH");  // A 정점에 인접한 정점 목록 등록
        map.put('B', "ACEF"); // B 정점에 인접한 정점 목록 등록
        map.put('C', "ABDE");
        map.put('D', "CE");
        map.put('E', "BCD");
        map.put('F', "ABHG");
        map.put('G', "FH");
        map.put('H', "AF");
        return map;
    }

    public static void DFS(HashMap<Character,String> 그래프, char 시작정점) {
        HashSet<Character> 방문한정점 = new HashSet<>();
        Stack<Character> 다음에방문할정점목록 = new Stack<>();
        방문한정점.add(시작정점);
        다음에방문할정점목록.push(시작정점);
        while (다음에방문할정점목록.isEmpty() == false) {
            char 현재정점 = 다음에방문할정점목록.pop();
            System.out.printf("%c ", 현재정점);
            String 인접정점목록 = 그래프.get(현재정점);
            for (char 인접정점 : 인접정점목록.toCharArray())
                if (방문한정점.contains(인접정점) == false) {
                    방문한정점.add(인접정점);
                    다음에방문할정점목록.add(인접정점);
                }
        }
    }

    public static void main(String[] args) {
        DFS(createGraph(), 'A');
    }
}
