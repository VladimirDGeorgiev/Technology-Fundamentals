package JavaAdvance.Workshop;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public void addFirst(int element) {
        ListNode newHead = new ListNode(element);
        if (this.size == 0) {
            this.head = this.tail = newHead;
        } else {
            newHead.next = this.head;
            this.head.previous = newHead;
            this.head = newHead;
        }

        this.size++;
    }

    public void addLast(int element) {
        ListNode newTail = new ListNode(element);

        if (this.size == 0) {
            this.head = this.tail = newTail;
        } else {
            newTail.previous = this.tail;
            this.tail.next = newTail;
            this.tail = newTail;
        }
        size++;
    }

    public int get(int index) {
        chechIndex(index);
        if (index <= this.size / 2) {
            ListNode firstNode = this.head;
            for (int i = 0; i < index; i++) {
                firstNode = firstNode.next;
            }
            return firstNode.item;
        } else {
            ListNode lastNode = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                lastNode = lastNode.previous;
            }
            return lastNode.item;
        }
    }

    public int removeFirst() {
        chechSize();
        int firstitem = this.head.item;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        } else {
            this.head.previous = null;
        }

        this.size--;
        return firstitem;
    }
    public int removeLast(){
        chechSize();
        int lastItem = this.tail.item;
        this.tail = this.tail.previous;

        if (this.tail==null){
            this.head=null;
        }else{
            this.tail.next = null;
        }
        this.size--;
        return lastItem;
    }
    public void forEach(Consumer<Integer> consumer){
        ListNode currentNode = this.head;
        while (currentNode!=null){
            consumer.accept(currentNode.item);
            currentNode=currentNode.next;
        }
    }
    public int[] toArray(){
        int[] array = new int[this.size];
        int counter = 0;
        ListNode currentNode = this.head;

        while (currentNode!=null){
            array[counter++] = currentNode.item;
            currentNode = currentNode.next;
        }
        return array;


    }

    private void chechSize() {
        if (this.size == 0) {
            throw new NoSuchElementException("This list is empty");
        }
    }

    private void chechIndex(int index) {
        if (index < 0 || index >= this.size) {
            String massage = String.format("Index: %d, Size: %d", index, this.size);
            throw new IndexOutOfBoundsException(massage);
        }
    }

    private class ListNode {
        private int item;
        private ListNode next;
        private ListNode previous;

        public ListNode(int item) {
            this.item = item;
        }


    }
}
