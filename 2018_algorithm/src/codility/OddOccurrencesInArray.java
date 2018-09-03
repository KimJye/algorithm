/*
 * 2018.05.14
 * 김지혜
 * N개의 정수로 구성되고 홀수 개의 원소들을 가지고 있는 배열은 한 원소를 제외한 
 * 나머지 원소들은 짝을 이룬다. 여기서 짝을 이루지 않는 원소를 알아내라.
 * Hash 와 Iterator 공부함.
 */
package codility;

//import java.util.*//HashSet사용하기위함
public class OddOccurrencesInArray {
	public static int solution(int[] A) {
		int a =0;
		
		for(int i=0;i<A.length;++i) {
			a=a^A[i];
		}
		return a;
	}
	/* 
	 * <HashSet>사용하기.
	 * HashSet은 동일한 값을 넣을 수 없다.
	 * Iterator(반복자): 컬렉션에 (Array, List, Set, Map)저장되어있는 요소들을 읽어오는 방법을 표준화.
	 * public static int solution(int[] A){
	 * HashSet<Integer> hs = new HashSet<Integer>();
	 * for(int i :A){
	 * 	if(!hs.add(i)){
	 * 		hs.remove(i);
	 * 	}
	 * }
	 * return hs.iterator().next();
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int array[] = {9,3,9,3,9,7,9};
		System.out.println(solution(array));
	}
}
