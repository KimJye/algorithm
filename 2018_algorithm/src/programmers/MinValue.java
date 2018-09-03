package programmers;

public class MinValue {
	public int solution(int no, int[] works) {
        int result = 12;
            
        int max=works[0];
        int index=0;
        
        for(int i=1;i<works.length;++i) {
        	if(max<works[i]) {
        		max=works[i];
        		index=i;
        	}
        }
        for(int i=0;i<no;++i) {
        	works[index]--;
        }
        System.out.println(works[0]);
        
        return result;
    }
	public static void main(String [] args) {
		MinValue m = new MinValue();
		int [] works = {4,3,3};
		System.out.println(m.solution(4, works));
	}
}
