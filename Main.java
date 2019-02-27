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
      list.remove(b);
      list.remove(c);
      list.print();

      Node<Integer> ax = new Node<>(2);
      Node<Integer> bx = new Node<>(4);
      Node<Integer> cx = new Node<>(9);
      Node<Integer> dx = new Node<>(5);
      LinkedList<Integer> list2 = new LinkedList<>();
      list2.add(ax);
      list2.add(bx);
      list2.add(cx);
      list2.add(dx, 1);
      System.out.println(list.equals(list2));
      list2.remove(bx);
      list2.remove(cx);
      System.out.println(list.equals(list2));
   }
}
