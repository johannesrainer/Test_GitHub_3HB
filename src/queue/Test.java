package queue;

public class Test {
	 
	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(5);
 
		queue.queueEnqueue(1);
		queue.queueEnqueue(2);
		queue.queueEnqueue(3);
        System.out.println("Elemente wurden erfolgreich in die Queue eingefügt.");
        queue.queueDequeue();
        queue.queueDisplay();
        queue.queueFront();
    }
}