package timbulchalka;

public class Node<T> {
    private T data;
    private Node next;

    public Node(T d, Node<String> nxt) {
        data = d;
        next = nxt;
    }

    public static void main(String[] args) {
        Node<String> x = new Node<>("Ukwuoma", null );
        Node<String> y = new Node<>("Emirexco", x);
        System.out.println(y.next.data);
        System.out.println(y.data);
    }


}
