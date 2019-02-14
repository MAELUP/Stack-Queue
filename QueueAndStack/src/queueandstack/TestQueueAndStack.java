package queueandstack;

public class TestQueueAndStack {

    public static void main(String[] args) {
        
        
        System.out.println("_________________Test Queue_________________");
        ArrayListQueueStack<String> animalsQ = new ArrayListQueueStack<>();
        animalsQ.addQueue("ant");
        animalsQ.addQueue("cat");
        animalsQ.addQueue("duck");
        animalsQ.addQueue("dog");
        animalsQ.addQueue("bird");
        animalsQ.addQueue("cobra");
        System.out.println(animalsQ.toString());
        animalsQ.removeQueue();
        animalsQ.removeQueue();
        System.out.println(animalsQ.toString());
        
        System.out.println("\n_________________Test Stack_________________");
        ArrayListQueueStack<String> animalsS = new ArrayListQueueStack<>();
        animalsS.addStack("ant");
        animalsS.addStack("cat");
        animalsS.addStack("duck");
        animalsS.addStack("dog");
        animalsS.addStack("bird");
        animalsS.addStack("cobra");
        System.out.println(animalsS.toString());
        animalsS.removeStack();
        animalsS.removeStack();
        System.out.println(animalsS.toString());
    
    
    }
}
