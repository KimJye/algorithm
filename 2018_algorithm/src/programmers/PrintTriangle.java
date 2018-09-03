package programmers;

public class PrintTriangle {
	public String printTriangle(int num){
        String str="";
        for(int i=0;i<num;++i){
            for(int j=0;j<i+1;++j){
                str+="*";
            }
            str+="\n";
        }
	return str;
	}
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(5) );
	}
}
