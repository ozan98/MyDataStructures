public class Slinked<E> {

    //nested node class.
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n){
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









}

