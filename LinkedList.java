public class LinkedList<E> {
   private Node<E> first;
   
   void add(Node<E> node) {
      Node<E> current = first;
      if(current == null) {
         first = node;
      } else {
         while (current.next != null) {
            current = current.next;
         }
         current.next = node;
      }
   }
   
   void add(Node<E> node, int index) {
      Node<E> current = this.first;
      for(int i = 0; i < index; i++) {
         current = current.next;
      }
      Node<E> temp = current.next;
      current.next = node;
      current.next.next = temp;
   }
   
   void remove(Node<E> node) {
      Node<E> current = first;
         if(current == node) {
            current = current.next;
         }
   }
   
   boolean exists(Node<E> node) {
      Node<E> current = first;
      while(current != null) {
         if(current.equals(node)) {
            return true;
         }
         current = current.next;
      }
      return false;
   }
   
   boolean equals(LinkedList list) {
      Node<E> current = first;
      return list.equals(current);
   }
   
   void print() {
      Node<E> current = first;
      while(current != null) {
         System.out.println(current.data);
         current = current.next;
      }
      System.out.println();
   }
}
