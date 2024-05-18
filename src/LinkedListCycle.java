public class LinkedListCycle {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
     Node node = new Node(1);
     node.next = new Node(2);
     node.next.next = new Node(3);
     node.next.next.next = new Node(4);
     node.next.next.next = node.next.next;
        boolean hasCycle = hashCycle(node);
        System.out.println("Has Cycle "+hasCycle);
    }

    private static boolean hashCycle(Node head) {
        boolean hasCycle = false;
        Node slowPointer = head;
        Node fastPointer = head.next;
        while (slowPointer != null && slowPointer.next != null && fastPointer!= null) {
            if (slowPointer == fastPointer) {
                hasCycle = true;
                break;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return hasCycle;
    }

}
