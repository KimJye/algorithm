class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int child = 0;
        int cookie = 0;
        int result = 0;
        
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                result++;
                child++;
            } 
            cookie++;       
        }
        return result;
    }
}

/**
각 아이들마다 먹고싶은 쿠키의 개수 = g[]
주어진 쿠키의 개수 = s[]
아이들이 먹고싶은 쿠키의 개수를 충족하는 최대의 값을 구하자.
1. 정렬
2. 아이들마다 주어진 쿠키의 개수가 충족되는지 확인 = g[child] ≤ s[cookie]
3. 충족되면 결과값 증가하고, 그 다음 아이로 탐색 및 그 해당 쿠키는 충족되었으니 다음 쿠키 탐색 
    1. result++
    2. child++
    3. cookie++  
4. 쿠키의 개수가 충족되지 않으면 그 다음 쿠키 탐색 = cookie++
*/
