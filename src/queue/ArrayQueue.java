package queue;

/**
 * ArrayQueue represents a simple implementation of a queue using an array.
 */
public class ArrayQueue {

    private static int front; // Index of the front element in the queue
    private static int rear; // Index of the rear element in the queue
    private static int capacity; // Maximum capacity of the queue
    private static int[] queue; // Array to store elements of the queue

    /**
     * Constructs an ArrayQueue with the specified size.
     *
     * @param size The maximum size of the queue
     */
    public ArrayQueue(int size) {
        front = 0;
        rear = 0;
        capacity = size;
        queue = new int[size];
    }

    /**
     * Adds an item to the rear of the queue.
     *
     * @param item The item to be added to the queue
     */
    public void queueEnqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full");
        } else {
            queue[rear] = item;
            rear++;
        }
    }

    /**
     * Removes and returns the item at the front of the queue.
     *
     * @return The item removed from the front of the queue
     */
    public int queueDequeue() {
        int firstElement = 0;
        if (rear == front) {
            System.out.println("Queue is empty!");
        } else {
            firstElement = queue[front];
            // Shift elements in the array
            for (int i = 0; i < (rear - 1); i++) {
                queue[i] = queue[i + 1];
            }
            if ((rear < capacity)) {
                queue[rear] = 0;
            }
            rear--;
        }
        return firstElement;
    }

    /**
     * Displays the elements of the queue.
     */
    public void queueDisplay() {
        if (front == rear) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.println(i);
            }
        }
    }

    /**
     * Retrieves the item at the front of the queue without removing it.
     *
     * @return The item at the front of the queue
     */
    public int queueFront() {
        int firstElement = 0;
        if (rear == front) {
            System.out.println("Queue is empty!");
        } else {
            firstElement = queue[front];
        }
        return firstElement;
    }

    // HÜ: ArrayQueueTest - Alle Methoden von ArrayQueue testen
    // JavaDoc-Kommentare
    // Kapitel 5 nochmals durcharbeiten

}
