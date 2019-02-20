public class Node<E> {
   private E data;
   private Node<E> next;
   
   public Node(E data) {
      this(data, null);
   }
   
   public Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;
   }
   
   public boolean equals(Node<E> node) {
      if(this.data == node) {
         return true;
      } 
      return false;
   }
}

class LinkedList<E> {
   private Node<E> first;
   
   public void add(Node<E> node) {
      if(this.first == null) {
         this.first = node;
      } else {
         Node current = this.first;
         while (current.next != null) {
            current = current.next;
         }
         current.next = node;
      }
   }
}