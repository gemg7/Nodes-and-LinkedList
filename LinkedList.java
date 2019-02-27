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
         if(first.equals(node)) {
            first = first.next;
         }
         Node<E> current = first;
         while(current != null && current.next != null) {
            if(current.next.equals(node) && current.next.next == null) {
               current.next = null;
            } else if(current.next.equals(node)) {
               current.next = current.next.next;
            }
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
      Node<E> current2 = list.first;
      while(current.next != null || current2.next != null) {
         if(!current.equals(current2)) {
            return false;
         }
         if((current.next == null && current2.next != null) || (current.next != null && current2.next == null)) {
            return false;
         }
         current = current.next;
         current2 = current2.next;
      }
      return true;
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
