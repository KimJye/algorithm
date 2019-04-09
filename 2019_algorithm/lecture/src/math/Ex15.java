package math;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 A[99]에 2~100사이의 정수를 기억시킨 후 이 배열을 이용하여 소수의 개수를 구하시오.
 * solution : 정수의 수열에서 처음 나온 소수의 배수들은 소수가 아니라는 원리.
 *            배열의 첫 번째에 들어있는 2는 소수지만 2의 배수들은 모두 소수가 아니다.
 *            그러므로 2의 배수가 들어 있는 위치에는 모두 0을 채워 소수가 아님을 표시한다.
 * 풀이 방법 : 1. 배열에 2부터 채운다.
 *             2. 소수의 개수를 증가한다.
 *             2-1. 만약, 배열의 값이 0이라면 소수가 아니므로 소수의 개수를 증가하지 않는다.
 *             3. 소수가 들어있는 인덱스 값을 m에 저장한다.
 *             3-1. m에 소수값만큼 더하여, 소수의 배수가 들어있는 위치에는 모두 0을 채운다.
 */
public class Ex15 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int k = 1; // 2부터 1씩 증가하는 갓이 저장될 변수. 즉, k는 2,3,4,,,,11
        int i = -1; // 배열의 위치를 지정해주는 변수.
        int j = 0; // 소수의 개수가 저장될 변수
        int m = 0; // 소수의 배수가 들어있는 위치를 지정할 변수

        do {
            k++;// k를 1로 더하고 시작하기 때문에 k를 1로 초기화 했었다.
            a[k - 2] = k;
        } while (k < 11);

        while(true){
            ++i;
            if(i>9){
                System.out.println(j);
                break;
            }
            if(a[i]==0) continue;
            j++;
            m=i;
            while(true){
                m+=a[i];
                if(m>9) break;
                a[m]=0;
            }
        }

    }
}
