public class LinkedList {
    private Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void display() {
        Node currentNode = head;
        System.out.print(currentNode.data+" ");
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data+" ");
        }
    }
}
