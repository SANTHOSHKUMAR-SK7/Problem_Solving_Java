package LinkedList;

public class Basic_LL {
    private Node head;
    private Node tail;
    private int size;

    public Basic_LL() {
        this.size = 0;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}