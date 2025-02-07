/*
https://leetcode.com/problems/add-two-numbers/description/?envType=daily-question&envId=2024-11-23
 */

package sayan_LL;

public class AddNumbersLL {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        int carry = 0;
        ListNode ptr = head;

        while(l1 != null && l2 !=null){
            ptr.val = l1.val + l2.val+ carry;
            if(ptr.val>9){
                carry = 1;
                ptr.val %= 10;
            }
            else{
                carry = 0;
            }

            l1 = l1.next;
            l2 = l2.next;
            //new Node created if any one of LL is non-empty
            if(l1 != null || l2 != null || carry != 0){
                ListNode temp = new ListNode();
                ptr.next = temp;
                ptr = temp;
            }

        }


        //remaining in case of unequal lengths
        while(l1 != null){
            ptr.val = l1.val + carry;
            if(ptr.val>9){
                carry = 1;
                ptr.val %= 10;
            }
            else{
                carry = 0;
            }

            l1 =l1.next;
            //new Node only if digit left
            if(carry != 0 || l1 != null){
                ListNode temp = new ListNode();
                ptr.next = temp;
                ptr = temp;
            }
        }

        while(l2 != null){
            ptr.val = l2.val + carry;
            if(ptr.val>9){
                carry = 1;
                ptr.val %= 10;
            }
            else{
                carry = 0;
            }

            l2 =l2.next;
            //new Node only if digit left
            if(carry != 0 || l2 != null){
                ListNode temp = new ListNode();
                ptr.next = temp;
                ptr = temp;
            }
        }
        //at last of each loop if carry > 0 an extra node is created
        if(carry > 0)
            ptr.val = carry;


        return head;

    }

}
