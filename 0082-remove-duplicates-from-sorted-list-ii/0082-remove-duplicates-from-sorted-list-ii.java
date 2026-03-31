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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head,prev=null,del;
        boolean flag;
        while(temp!=null && temp.next!=null){
            flag=false;
            while(temp.next!=null&&temp.val==temp.next.val){
                del=temp.next;
                temp.next=temp.next.next;
                del.next=null;
                flag=true;
            }
            if(flag==true && prev==null){
                head=temp.next;
                temp.next=null;
                temp=head;
            }
            else if(flag==true){
                prev.next=temp.next;
                temp.next=null;
                temp=prev.next;

            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}