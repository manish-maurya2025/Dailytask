class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedlist {

    // Iterative Reverse
    static Node reverseIterative(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next; // save next
            current.next = prev;      // reverse pointer

            prev = current;           // move prev
            current = next;           // move current
        }

        return prev; // new head
    }
// static Node reverseRecursive(Node head) {

//     if (head == null || head.next == null) {
//         return head;   // base case
//     }

//     Node newHead = reverseRecursive(head.next);

//     head.next.next = head;
//     head.next = null;

//     return newHead;
// }

    // Print List
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating list: 10 → 20 → 30 → 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original List:");
        printList(head);

        head = reverseIterative(head);

        System.out.println("Reversed List (Iterative):");
        printList(head);
    }
}
