package recursive;

public class Ex6 {

    static void print(int[]a,int index){
        if(index>=a.length) return;
        System.out.printf("%d ",a[index]);
        print(a,index+1);
    }
    public static void main(String[] args){
        int[]a={1,2,3,4,5,6,7,8,9};
        print(a,0);
    }
}
