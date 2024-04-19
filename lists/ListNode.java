package lists;
public class ListNode {
    private char value;
    private ListNode next;

    public ListNode(char letter, ListNode pointer) {
        value = letter;
        next = pointer;
    }

    public ListNode(char letter) {
        value = letter;
        next = null;
    }

    public boolean add(char letter) {
        ListNode newNode = new ListNode(letter);
        ListNode currentNode;
        currentNode = this;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
        currentNode.next = newNode;
        return true;
    }

    public boolean add(int index, char letter) {
        ListNode currentNode;
        currentNode = this;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
        currentNode.next = new ListNode(letter, currentNode.next);
        return true;
    }
    
    public char get(int index) {
        ListNode currentNode;
        currentNode = this;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        return currentNode.value;
    }

    public void remove(int index) {
        ListNode currentNode;
        currentNode = this;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
        currentNode.next = currentNode.next.next;
    }

    public boolean isEmpty() {
        ListNode currentNode;
        currentNode = this;
            while (currentNode != null || currentNode.next != null) {
                return false;
            }
        return true;
    }

    public int size() {
        ListNode currentNode;
        currentNode = this;
        int count;
        count = 1;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                count++;
            }
        return count;
    }

    public String toString() {
        String r;
        ListNode currentNode;
        r = "[";
        currentNode = this;
            while (currentNode.next != null) {
                r = r + currentNode.value + ", ";
                currentNode = currentNode.next;
            }
        return r + currentNode.value + "]";
    }
}
