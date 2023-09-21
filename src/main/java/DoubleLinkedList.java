public class DoubleLinkedList {
    private Node head;
    private int size;

    public DoubleLinkedList(int data) {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        // B1: Tạo Node mới
        Node tmp = new Node(data);
        // B2: kiểm tra xem kích thước của LinkedList = 0 -> rỗng
        if(size == 0) {
            head = tmp;
            size++;
            return;
        }
        // Lấy head hiện tại
        head.setPrev(tmp);
        tmp.setNext(head);
        // Gán head mới cho tmp
        head = tmp;
        // Tăng size thêm 1 đơn vị
        size++;
    }
    public void addLast(int data) {
        if (size == 0) {
            addFirst(data);
            return;
        }
        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }
        // Đã có phần tử cuối
        Node tmp = new Node(data);
        last.setNext(tmp);
        tmp.setPrev(last);
        // Tăng size của LinkedList
        size++;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        Node i = head;
        while (i != null) {
            System.out.print(i + "<->");
            i = i.getNext();
        }
        System.out.print("NULL\n");
    }
}
