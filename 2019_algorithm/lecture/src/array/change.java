package array;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 숫자의 좌우 위치 변경
 * description : 첫 번째 위치부터 특정 번째까지 0이 아닌 자연수가 들어 있고, 나머지는 0이 들어 있다.
 *               처음으로 0이 나오기 전까지의 숫자들의 위치를 반대로 교환하여 출력하라.
 *               예를 들어 1234500000이면 5432100000으로 출력
 * solution : 2차원 배열 이용하기
 */
public class change {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,0,0,0,0};

        int i=0; // 교환할 숫자의 첫 위치 변수
        int j=0; // 교환할 숫자의 끝 위치 변수

        while(a[i]!=0)
            i++;
        j=i-1;
        i=0;
        int m = (i+j)/2;

        while(true){
            int t = a[i];
            a[i]=a[j];
            a[j]=t;

            if(i==m) break;
            i++;
            j--;
        }
        for(int l : a)
            System.out.print(l+" ");
    }
}
