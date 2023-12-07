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
    static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(curr.next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }

        curr.next = prev;
        return curr;
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        head = reverseList(head);
        printList(head);
    }
}