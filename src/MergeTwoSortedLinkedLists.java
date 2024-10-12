public class MergeTwoSortedLinkedLists {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(3);
        Node l2 = new Node(4);
        l2.next = new Node(5);
        l2.next.next = new Node(6);
       Node mergeList = mergeTwoList(l1, l2);
       printList(mergeList);
    }

    private static void printList(Node mergeList) {
        Node current = mergeList;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    private static Node mergeTwoList(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data){
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null)
            current.next = l1;
        else
            current.next = l2;
        return dummy.next;
    }
}
