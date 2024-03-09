import java.util.Iterator;

class MyLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    
    
    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }
    
    private class MyLinkedListIterator implements Iterator<T> {
        private Node<T> current = head;
        
        @Override
        public boolean hasNext() {
            return current != null;
        }
        
        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    private static class Node<T> {
        T data;
        Node<T> next;
        
    }
}

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
