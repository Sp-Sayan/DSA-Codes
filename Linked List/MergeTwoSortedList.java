
/*
https://leetcode.com/problems/merge-two-sorted-lists/
 */



package sayan_LL;

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
            return list1;
        if(list1 == null || list2 == null)
            return (list1 == null)?list2:list1;


        ListNode newHead;

        if(list1.val <= list2.val){
            newHead = list1;
            list1 = list1.next;
        }
        else{
            newHead = list2;
            list2 = list2.next;
        }
        System.out.println(newHead.val);
        ListNode ptr = newHead;

        while(list2 != null && list1 != null){
            if(list1.val <= list2.val){
                ptr.next = list1;
                list1 = list1.next;
                //System.out.println(ptr.val);
            }
            else{
                ptr.next = list2;
                list2 = list2.next;

            }

            ptr = ptr.next;
            //System.out.println(ptr.val);

        }

        while(list1 != null){
            ptr.next = list1;
            list1 = list1.next;
            ptr = ptr.next;
        }
        while(list2 != null){
            ptr.next = list2;
            list2 = list2.next;
            ptr = ptr.next;
        }

        ptr.next = null;

        return newHead;
    }
}
