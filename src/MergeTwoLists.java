public class MergeTwoLists {
    public static void main(String[] args) {
        NodeList list1 = new NodeList(1);
        list1.next = new NodeList(2);
        list1.next.next = new NodeList(4);

        NodeList list2 = new NodeList(1);
        list2.next = new NodeList(3);
        list2.next.next = new NodeList(4);
        NodeList list = getMergeList(list1, list2);
        while (list != null) {
            System.out.print(list.data + ", ");
            list = list.next;
        }
    }

    private static NodeList getMergeList(NodeList list1, NodeList list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null && list2 != null) {
            return list2;
        }
        if (list1 != null && list2 == null) {
            return list1;
        }
        NodeList list = new NodeList();
        NodeList current1 = list1;
        NodeList current2 = list2;
        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                append(list, current1.data);
                current1 = current1.next;
            } else {
                append(list, current2.data);
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            append(list, current1.data);
            current1 = current1.next;
        }
        while (current2 != null) {
            append(list, current2.data);
            current2 = current2.next;
        }

        return list;
    }

    private static void append(NodeList list, Integer data) {
        if (list.data == null) {
            list.data = data;
        } else {
            NodeList newNode = new NodeList(data);
            NodeList current = list;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

class NodeList {
    Integer data;
    NodeList next;

    public NodeList(Integer data) {
        this.data = data;
    }

    public NodeList() {
    }

    public void append(NodeList list, int data) {

    }
}