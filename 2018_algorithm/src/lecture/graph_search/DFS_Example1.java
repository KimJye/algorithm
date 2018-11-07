package graph_search;

import java.util.HashMap;
import java.util.HashSet;

public class DFS_Example1 {

    public static HashMap<Character, String> createGraph() {
        HashMap<Character, String> map = new HashMap<>();
        map.put('A', "BFH");  // A 정점에 인접한 정점 목록 등록
        map.put('B', "ACEF"); // B 정점에 인접한 정점 목록 등록
        map.put('C', "BDE");
        map.put('D', "CE");
        map.put('E', "BCD");
        map.put('F', "ABGH");
        map.put('G', "F");
        map.put('H', "AF");
        return map;
    }

    public static void DFS(HashMap<Character,String> 그래프, char 시작정점) {
        DFS(그래프, 시작정점, new HashSet<>());
    }

    static void DFS(HashMap<Character,String> 그래프, char 현재정점, HashSet<Character> 방문한정점) {
        방문한정점.add(현재정점);
        System.out.printf("%c ", 현재정점);
        String 인접정점목록 = 그래프.get(현재정점);
        for (char 인접정점 : 인접정점목록.toCharArray())
            if (방문한정점.contains(인접정점) == false)
                DFS(그래프, 인접정점, 방문한정점);
    }

    public static void main(String[] args) {
        DFS(createGraph(), 'A');
    }
}
