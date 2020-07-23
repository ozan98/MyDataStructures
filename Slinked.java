public class Slinked<E> {

    //nested node class.
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node( E e, Node<E> n){
            element = e;
            next = n;
        }
        //getting current element in node.
        E getElement(){
            return element;
        }
        //getting the next node in the list
        Node<E> getNext(){
            return next;

        }
        //setting the next node with the provided node.
        void setNext(Node<E> n){
            next = n;
        }
    }
    //end of node class

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public Slinked(){} //initially created as a empty list
    //accersor methods

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E getFist(){
        if(isEmpty()) 
        return null;
        return head.getElement();
    }
    public E getLast(){
        if(isEmpty()) 
        return null;
        return tail.getElement();
    }

    public void addFirst( E e){
        head = new Node<>(e, head.next);
        if(size == 0)
            head = tail; // special case where if size is 0 then tail and head will be pointing to the same node.
        size++;
    }
    public void addLast(E e){
        Node<E> newNode = new Node<E>(e, null);

        if(isEmpty())
            head = newNode;

        tail.setNext(newNode);
        tail = newNode;
        size++;
        
    }

    public void removeLast(){
        Node<E> currentNode = head;
        while(currentNode.getNext() == null){
                currentNode = currentNode.getNext();
        }
        currentNode = null;

    }









}

