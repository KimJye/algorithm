public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n !=0) {
            if ((n & 1) == 1) ++count; 
            n= n>>>1;
        }
        
        return count;
    }
}
/**
2진수로 바꾸었을 때 길이가 n인 정수에서 1인 bit만 세어보는 알고리즘
십진수를 이진수로 변환했을때 1비트가 몇개 있느냐 검색하는 문제
*/
