package array;
/*
  배열 a에서 index 위치 뒤의 값들을 한 칸씩 앞으로 당기고 (반복문으로 구현)
   배열의 끝에 0을 대입하라
구현한 메소드의 시간 복잡도는? O(n)
 */
public class Ex2 {

    static void print(int[]a){
        for(int i:a)
            System.out.printf("%d ",i);
    }
    static void remove(int[]a,int index){

        for(int i=index; i<a.length-1;++i){
            a[i]=a[i+1];
        }
        a[a.length-1]=0;//배열 끝에 0 대입
    }
    public static void main(String[]args){
        int [] a = new int[10];
        for(int i=0; i<10; ++i){
            a[i]=i;
        }
        remove(a,5);
        print(a);
    }
}
