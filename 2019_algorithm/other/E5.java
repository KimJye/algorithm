/*
풀이과정 : 처음에는, 두자리수까지만 생각하고 주어진 숫자를 10으로 나눈 몫과 나머지로 풀었었는데(왜 주석처리 안하고 지웠을까...)
           문자로 하니 엄청 간결해졌고 실수가 나지 않았다.
 */
public class E5 {
    public static int solution(int number) {
        int answer = 0;

        for(int i=1; i<=number; ++i){
            String str = String.valueOf(i);

            for(int j=0; j<str.length(); ++j){
                if((Integer.valueOf(String.valueOf(str.charAt(j)))%3==0) && (Integer.valueOf(String.valueOf(str.charAt(j)))!=0)){
                    answer++;
                }
            }

        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(10000));
    }
}
