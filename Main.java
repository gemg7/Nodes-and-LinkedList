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

      list.print();
      list2.print();
      LinkedList<Integer> merged = mergeLists(list, list2);
      merged.print();

      Node<Integer> parent = merged.getParent(new Node<Integer>(5));
      parent.print();

      merged.add(c);
      merged.print();
      merged.truncateList(9);
      merged.print();
   }

   public static LinkedList<Integer> mergeLists(LinkedList<Integer> list, LinkedList<Integer> list2) {
      LinkedList<Integer> result = new LinkedList<>();
      Node<Integer> listCurr = list.first;
      Node<Integer> list2Curr = list2.first;

      while(list2Curr != null || listCurr != null) {
         Node<Integer> add = new Node<Integer>(null);
         if(listCurr == null) {
            add.data = list2Curr.data;
            result.add(add);
            list2Curr = list2Curr.next;
         } else if(list2Curr == null) {
            add.data = listCurr.data;
            result.add(add);
            listCurr = listCurr.next;
         } else if(listCurr.data < list2Curr.data) {
            add.data = listCurr.data;
            listCurr = listCurr.next;
            result.add(add);
         } else {
            add.data = list2Curr.data;
            list2Curr = list2Curr.next;
            result.add(add);
         }
      }
      return result;
   }
}
