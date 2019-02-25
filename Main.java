public class Main {
   public static void main(String[] args) {
      Node<Integer> a = new Node<>(2);
      Node<Integer> b = new Node<>(4);
      Node<Integer> c = new Node<>(9);
      Node<Integer> d = new Node<>(5);
      LinkedList<Integer> list = new LinkedList<>();
      list.add(a);
      list.add(b);
      list.add(c);
      list.add(d, 1);
      list.print();
      list.remove(a);
      list.print();
   }
}
