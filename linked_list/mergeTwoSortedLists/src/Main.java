class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Main {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);

            return list1;
        }
        else {
            list2.next = mergeTwoLists(list2.next, list1);

            return list2;
        }
    }

    static void printList(ListNode head) {
        System.out.print("[");

        while(head != null) {
            System.out.print(head.val);
            System.out.print(",");
            head = head.next;
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        printList(list1);
        printList(list2);
        printList( mergeTwoLists(list1, list2) );
    }
}