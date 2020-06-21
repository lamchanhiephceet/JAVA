public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(9);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);

        ll.add(4,6);
        ll.add(5,9);
        ll.printList();
    }
}
