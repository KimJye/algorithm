/*
풀이과정 : 처음에는,,,하드코딩으로 했다..조건도 다 안해주고,, 실수가 있었을 것이다...
 */
public class E4 {
    // 조건
    static boolean preRequisites(int [] p, int [] c){
        //조건 : 왼쪽 페이지는 홀수, 오른쪽 페이지는 짝수 번호
        if (p[0] % 2 == 0 || c[0] % 2 == 0) {
            return false;
        }

        //조건 : 페이지 번호가 1부터 시작되는 400 페이지. 예외사항
        // pobi
        for (int i = 0; i < p.length; ++i) {
            if (0 > p[i] || 399 < p[i]) {
                return false;
            }
            if((i+1)>=p.length){
                break;
            }
            if (p[i + 1] - p[i] != 1) {
                return false;
            }
        }
        //crong
        for (int i = 0; i < c.length; ++i) {
            if (0 > c[i] || 399 < c[i]) {
                return false;
            }
            if((i+1)>=c.length){
                break;
            }
            if (c[i + 1] - c[i] != 1) {
                return false;
            }
        }
        return true;
    }
    static int[] findMax(int[] pobi, int []crong){
        int []max=new int[2];
        //pobi
        for (int i = 0; i < pobi.length; ++i) {
            int p = pobi[i];
            int psum = 0;
            int pm = 1;
            while (p > 0) {
                psum += p % 10;
                pm *= p % 10;
                p = p / 10;
            }
            max[0] = Math.max(max[0], Math.max(psum, pm));
        }

        //crong
        for (int i = 0; i < crong.length; ++i) {
            int c = crong[i];
            int csum = 0;
            int cm = 1;
            while (c > 0) {
                csum += c % 10;
                cm *= c % 10;
                c = c / 10;
            }
            max[1] = Math.max(max[1], Math.max(csum, cm));
        }
        return max;
    }
    public static int solution(int[] pobi, int[] crong) {
        if(!preRequisites(pobi,crong)){
            return -1;
        }
        int []max = findMax(pobi,crong);

        // 최종 결과값
        if (max[0] > max[1]) {
            return 1;
        } else if (max[0] < max[1]) {
            return 2;
        } else if (max[0] == max[1]) {
            return 0;
        }
        return 0;
    /*
        처음 풀었을 때 아래로 풂..
        int a = (pobi[0] / 10) + (pobi[0] % 10);//왼쪽 값 합
        int b = (pobi[0] / 10) * (pobi[0] % 10);//왼쪽 값 곱
        int c = (pobi[1] / 10) + (pobi[1] % 10);//오른쪽 갑 합
        int d = (pobi[1] / 10) * (pobi[1] % 10);//오른쪽 값 곱
        int [] pa = {a,b,c,d};

        int pmax=0;
        for (int i = 0; i < pa.length; ++i) {
            if(pmax<pa[i]){
                pmax=pa[i];
            }
        }

        //197, 198. 1+9+7과 1*9*7 그리고 1+9+8과 1*9*8에서 가장 큰 값 고르기
        int [] arr = new int [4];
        String c1 = String.valueOf(crong[0]);
        String c2 = String.valueOf(crong[1]);
        int sc1;

        for(int i=0; i<c1.length(); ++i){
            arr[i]= c1.charAt(i)
        }
        int e = (crong[0]/100) + ((crong[0]-100)/10)+ ((crong[0]-100)-((crong[0]-100)/10)*10);
        int f = (crong[0]/10) * ((crong[0]-100)/10) * ((crong[0]-100)-((crong[0]-100)/10)*10) ;
        int g = (crong[1]/10) + ((crong[1]-100)/10) + ((crong[1]-100)-((crong[1]-100)/10)*10);
        int h = (crong[1]/10) * ((crong[1]-100)/10) * ((crong[1]-100)-((crong[1]-100)/10)*10);

        int [] ca = {e,f,g,h};
        int cmax=ca[0];
        for (int i = 0; i < ca.length; ++i) {

            if(cmax<ca[i]){
                cmax=ca[i];
            }
        }
        if(pmax>cmax){
            return 1;
        }else if(pmax<cmax){
            return 2;
        }else if(pmax==cmax){
            return 0;
        }
        */
    }

    public static void main(String[] args) {
        int[] p = {97, 98};
        int[] c = {211, 212};//[131, 132]	[211, 212]v v[99, 102]	[211, 212]
        System.out.println(solution(p, c));
    }
}
