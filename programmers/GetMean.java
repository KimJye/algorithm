/*
 * 2018.04.30
 * 김지혜
 * 함수를 완성해서 매개변수 array의 평균값을 return하도록 만들어 보세요.
 * 어떠한 크기의 array가 와도 평균값을 구할 수 있어야 합니다.
 */
package programmers;

public class GetMean {
	
	 public int getMean(int[] array) {
		 
		 int sum=0;
		 
		 for(int i=0;i<array.length;++i) {
			 sum+=array[i];
		 }
	        return sum/array.length;
	    }

	    public static void main(String[] args) {
	        int x[] = {5, 4, 3};
	        GetMean getMean = new GetMean();
	        // 아래는 테스트로 출력해 보기 위한 코드입니다.
	        System.out.println("평균값 : " + getMean.getMean(x));
	    }
}
