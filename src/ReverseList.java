public class ReverseList {

   static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        printList(node);
       Node reverseNode = reverseList(node);
        System.out.println("");
       printList(reverseNode);

    }

    private static Node reverseList(Node head) {
       Node prev = null;
       Node curr = head;
       while ( curr != null ){
           Node nextTemp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextTemp;
       }
        return prev;
    }

    private static void printList(Node head) {
       Node temp = head;
       while (temp != null ){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
    }
}
