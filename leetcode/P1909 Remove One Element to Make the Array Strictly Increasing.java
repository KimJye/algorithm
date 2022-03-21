class Solution {
    public boolean canBeIncreasing(int[] nums) {
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int troll = 0;
        
        if (nums[0] >= nums[1]) troll++;
        
        for(int i=0; i<nums.length; ++i) {
            if (stack.empty() || stack.size()<2) {
                stack.push(nums[i]);
                continue;
            }
            
            if (stack.peek() >= nums[i] ) {
                troll++;
                if (nums[i] > nums[i-2]){
                    stack.pop();
                } else continue; 
                
            }
            
            stack.push(nums[i]);
        }
        
        return troll <= 1;
        
    }
}
// 방해 요소를 troll로 지정하고, troll를 찾으면서 troll 개수를 증가하였다.
// 처음에는 스택에 쌓다가 top값보다 작거나 같으면 pop했고 [2,3,1,2] 는 틀린것을 보고 직전값 비교가 아님을 깨달음. 
// nums[i]의 값이 top값보다 작거나 같을때 2번째 전의 값보다 크면 직전값이 troll이고 아니면 nums[i]의 값이 troll이었다.
// [1,2,10,5,7]
// ⇒ 1 < 2 < 10 > 5 < 7
// [2,3,1,3]
// ⇒ 2 < 3 > 1 < 3
// [1,2,3,4]
// ⇒ 1 < 2 < 3 < 4
// [1,2,3,4] 같은 경우는 troll이 없는 엄격한 배열의 형태다.
// 따라서 troll의 개수가 2 보다 작으면 true를 리턴했다.
// 초반에는 troll <= 1; 로 했는데, Runtime 107ms, Memory 46MB로 런타임은 더 길지만 메모리는 오히려 적었다.
