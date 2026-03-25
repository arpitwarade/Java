package org.LinkedList;

public class LinkedList {
    Node start;
    Node end;
    Node current;
    int maxCount;

    public void add(Object data) {
        Node tmpNode = new Node(data);
        if (start == null) {
            start = end = current = tmpNode;
        } else {
            end.next = tmpNode;
            tmpNode.previous = end;
            end = tmpNode;
        }
        maxCount++;
    }

    public void delete(int index) {
        // 1. Check if list is empty or index is out of bounds
        if (start == null || index < 0 || index >= maxCount) {
            return;
        }

        // 2. Case: Only one node in the list
        if (start == end) {
            start = end = current = null;
        } 
        // 3. Case: Delete the head
        else if (index == 0) {
            start = start.next;
            if (start != null) start.previous = null;
        } 
        // 4. Case: Delete the tail
        else if (index == maxCount - 1) { // Fixed "1se if" typo
            end = end.previous;
            if (end != null) end.next = null;
        } 
        // 5. Case: Delete from the middle
        else {
            Node tmpNode = start;
            for (int iTmp = 0; iTmp < index; iTmp++) {
                tmpNode = tmpNode.next;
            }
            tmpNode.previous.next = tmpNode.next;
            tmpNode.next.previous = tmpNode.previous;
        }
        maxCount--;
    }

    public Object getFirst() {
        if (start == null) return null;
        current = start;
        return current.data;
    }

    public Object getLast() {
        if (start == null) return null;
        current = end;
        return current.data;
    }

    public Object getPrevious() {
        if (start == null || current == start || current == null) 
            return null;
        current = current.previous;
        return current.data;
    }

    public Object getNext() {
        if (start == null || current == end || current == null) 
            return null;
        current = current.next;
        return current.data;
    }

    public int getMaxCount() {
        return maxCount;
    }
    public Node getStart() {
    	return start;
    }
}