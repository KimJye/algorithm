package array;

import java.util.Scanner;

/*
 * Date: 2019. 03. 25
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2920
 * Title : 음계
 * description : 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
                 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

                 출력 : 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

 * solution : 1차원 배열 문제
 * 풀이과정 : 숫자를 배열에 넣은 후, 배열 하나하나를 비교하여 각 차이가 1이면 ascending, -1이면 descending, 둘다 아니면 mixed다.
              더 좋은 방법이 있을까...? 아예 문자로 받아들이면 어떤가? 효율이 더 좋은지 비교해봐야겠다.
              결과적으로 메모리는 살짝 아꼈다. 시간은 같고. 대신 이렇게 풀면 입력 조건 코드가 길어질것같다.

 */
public class P2920v2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//1부터 8까지, 입력이 그리 많지 않으므로
        String input = sc.nextLine();
        sc.close();
        String ascending = "1 2 3 4 5 6 7 8";
        String descending = "8 7 6 5 4 3 2 1";
        if(input.equals(ascending)){
            System.out.println("ascending");
        }else if(input.equals(descending)){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
