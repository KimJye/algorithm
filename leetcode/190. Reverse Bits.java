public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i=0; i<32; ++i) {
            result = result << 1;
            if ((n & 1) == 1) {
                result = result | 1;
            }
            n = n >> 1;
        }  
        return result;
    }
}

/**
주어진 10진수 n을 2진수로 변환했을때 2진수를 거꾸로 뒤집은 값을 구한다.
n(2진수)의 첫번째가 1이면 1을 더하고 n을 right shift 1 한다
첫번째로 더한 값이 뒤집어져야되니까 맨 뒤로 가려면 left shift 을 해야한다.
따라서 result을 left shift하고 n의 첫번째가 1인지 확인하고 1이면 result에 1을 더하고 n을 right shift한다.
만약 n의 첫번째가 1이 아니면 0이라는 얘기니까 n을 right shift만 하면된다.
*/
