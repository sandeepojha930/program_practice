public class ReverseLinkedList {

   static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(head);
        Node reverseList = reverseList(head);
        printList(reverseList);

    }

    private static Node reverseList(Node head) {
       Node prev = null;
       Node current = head;
       while (current != null){
           Node nextNode = current.next;
           current.next = prev;
           prev = current;
           current = nextNode;
       }
       return prev;
    }

    private static void printList(Node head) {
       Node current = head;
       while (current != null) {
           System.out.print(current.data+" ");
           current = current.next;
       }
        System.out.println();
    }
}
