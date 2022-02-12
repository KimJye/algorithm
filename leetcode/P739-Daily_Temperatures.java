class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer = new int [temperatures.length];
        if (temperatures.length == 0) return answer;
        
        for (int i=0; i<temperatures.length; ++i) {
            
            for (int j=i+1; j<temperatures.length; ++j) {
                if (temperatures[i] < temperatures[j]) {
                    answer[i] = j-i;
                    break;
                }
            }
        }
        return answer;
    }
}

/**
 * 일일 온도 목록이 주어지면 입력의 각 날짜에 대해 더 따뜻한 온도까지 기다려야하는 일 수를 알려주는 목록을 반환. 이것이 가능한 미래 날이 없으면 대신 0.
 * 단순 탐색으로 구현했으나 Stack 방법이 더 효율적
 */
