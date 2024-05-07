/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode removeNodes(ListNode head) {
//         Stack<Integer> s=new Stack<>();
//         if(head==null)
//             return null;
//         s.push(head.val);
//         head=head.next;
        
//         while(head!=null){
//             if(head.val<s.peek()){
//                 s.push(head.val);
//             }else{
//                 while(!s.isEmpty() && head.val>s.peek())
//                     s.pop();
//                 s.push(head.val);
//             }
//             head=head.next;
//         }
//         Stack<Integer> tempStack = new Stack<>();
//     while (!s.isEmpty()) {
//         tempStack.push(s.pop());
//     }
//         ListNode dummy=new ListNode(-1);// Dummy node to simplify insertion
//         ListNode ans=dummy;
//         while(!tempStack.isEmpty()){
//             ListNode x=new ListNode(tempStack.pop());
//             ans.next=x;
//             ans=ans.next;
//         }
        
//         return dummy.next;
        
        ListNode curr=head;
        Stack<ListNode> s=new Stack<>();
        while(curr!=null){
            while(!s.isEmpty() && curr.val>s.peek().val){
                s.pop();
            }
            s.push(curr);
            curr=curr.next;
        }
        ListNode nxt=curr;
        while(!s.isEmpty()){
            curr=s.pop();
            curr.next=nxt;
            nxt=curr;
        }
    return curr;
    }
}