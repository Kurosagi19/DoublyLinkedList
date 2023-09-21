public class Main {
    public static void main(String[] args) {
//        // Tạo 3 Node
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        // Next n1 -> n2
//        n1.setNext(n2);
//        n2.setPrev(n1);
//
//        n2.setNext(n3);
//        n3.setPrev(n2);
//
//        System.out.println(n1);

        DoubleLinkedList dll = new DoubleLinkedList(10);
        dll.addFirst(10);
        dll.display();
        dll.addFirst(20);
        dll.display();

        dll.addLast(30);
        dll.display();
    }
}
