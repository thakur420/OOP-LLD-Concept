import java.util.Iterator;

public class Node implements Iterable<Integer>{
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }

    private class NodeIterator implements Iterator<Integer> {
        private Node node;
        public NodeIterator(Node node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Integer next() {
            Integer data = node.data;
            node =  node.next;
            return data;
        }
    }
}
