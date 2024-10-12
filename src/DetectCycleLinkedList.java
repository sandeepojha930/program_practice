public class DetectCycleLinkedList {
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
        head.next.next.next = head;
        detectLoop(head);
    }

    private static void detectLoop(Node head) {
        Node slow = head;
        Node faster = head;
        while (faster != null && faster.next != null) {
            slow = slow.next;
            faster = faster.next.next;
            if (slow == faster) {
                System.out.println("Loop detected");
                return;
            }
        }
        System.out.println("No loop detected");
    }
}
