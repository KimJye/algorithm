package sort;

/*
 * Date: 2019. 04. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 병합
 * description : 다음의 처리 조건에 맞게 병합하라.
 * 처리 조건 : 1. 배열 A, B에는 정수가 오름차순으로 정렬되어 있다.
 *             2. 데이터는 10 미만.
 *             3. 배열 A, B에서 0이 들어 있는 다음의 요소에는 데이터가 없는 것으로 간주한다.
 *             4. 배열 A, B를 병합시켜 배열 C에 기억시키고 맨 마지막에는 0을 기억시킨다.
 *             5. 배열 A와 B에 같은 데이터가 있으면 한 번만 C에 옮긴다.
 *
 * 풀이 과정 :
 */
public class merge {

    static void print(int[] c, int t) {
        for (int i=0; i<t; ++i) {
            System.out.print(c[i] +" ");
        }
        return;
    }

    //배열 b의 나머지 자료를 배열 c에 넣는다.
    static void bc(int[] b, int[] c, int bn, int cn) {
        int t=cn;
        for (int i = cn; i <= c.length; ++i) {
            if(b.length==bn) break;
            c[i] = b[bn];
            bn++;
            t++;
        }
        print(c,t);
    }

    //배열 a의 나머지 자료를 배열 c에 넣는다.
    static void ac(int[] a, int[] c, int an, int cn) {

        int t=cn;

        for (int i = cn; i <= c.length; ++i) {
            if(a.length==an) break;
            c[i] = a[an];
            an++;
            t++;
        }
        print(c,t);
    }

    static void solution(int[] a, int[] b) {
        int[] c = new int[20];
        int an = 0;
        int bn = 0;
        int cn = 0;

        while (true) {
            if((a.length==an) || (b.length==bn))
                break;

            if (a[an] < b[bn]) {
                if (a[an] == 0) {
                    //배열 b의 나머지 자료를 배열 c에 넣는다.
                    bc(b, c, bn, cn);
                    break;
                }
                c[cn] = a[an];
                cn++;
                an++;

            } else if (a[an] > b[bn]) {
                if (b[bn] == 0) {
                    //배열 a의 나머지 자료를 배열 c에 넣는다.
                    ac(a, c, an, cn);
                    break;
                }
                c[cn] = b[bn];
                bn++;
                cn++;

            } else if (a[an] == b[bn]) {
                if (a[an] == 0) {
                    //배열 b의 나머지 자료를 배열 c에 넣는다.
                    bc(b, c, bn, cn);
                    break;
                } else if (b[bn] == 0) {
                    //배열 a의 나머지 자료를 배열 c에 넣는다.
                    ac(a, c, an, cn);
                    break;
                }
                c[cn] = a[an];
                cn++;
                bn++;
                an++;
            }
        }

    }

    public static void main(String[] args) {

        int[] a = {2, 3, 5, 8, 9, 10, 12, 13, 0};
        int[] b = {1, 3, 5, 6, 0};

        solution(a, b);

    }
}
