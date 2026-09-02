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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        LinkedList<Integer> list = new LinkedList<>();
        if(head==null  || head.next==null  || k==0)
        {
            return head;
        }
        while(temp!=null)
        {
            
            list.add(temp.val);
            temp=temp.next;
        }

        k=k%list.size();

        for(int i=0;i<k;i++)
        {
            int last=list.removeLast();
            list.addFirst(last);
        }

        ListNode headNew=null;
        ListNode tail=null;

        for(int val:list)
        {
            ListNode newnode=new ListNode(val);
            if(headNew==null)
            {
                headNew=newnode;
                tail=newnode;
            }
            else{
            tail.next=newnode;
            tail=newnode;
            }
        }
        return headNew;
    }
}