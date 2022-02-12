/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        List<ListNode> nodeList = new ArrayList();
        
        while(head.next != null) {
            if (nodeList.contains(head)) return true;
            
            nodeList.add(head);
            head = head.next;
        }
        return false;
    }
  
      public boolean hasCycleByTortoiseAndHareAlgorithm(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
 
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return false;
    }
}


/**
 * 주어진 링크드 리스트가 순환형태인지 확인하는 문제
 * 주어진 링크드 리스트의 노드가 없으면 false
 * 주어진 링크드 리스트의 노드를 탐색, 기존 탐색 이력이 있으면 순환구조로 true
 * 기존 탐색 이력 관리를 위해, 주어진 노드를 저장하기 때문에 이 방식은 링크드 리스트 크기가 커질수록 불리하다.
 * 더 알아보니, 토끼와 거북이 알고리즘이 효율적. (https://heod.tistory.com/2) => hasCycleByTortoiseAndHareAlgorithm()
 */
