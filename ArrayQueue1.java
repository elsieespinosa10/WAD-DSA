public class ArrayQueue1 {

  private int capacity;
  private int head = 0;
  private int tail = 0;
  private String[] storage;
  
  // constructor = initialize an object instance of the class
  public ArrayQueue1(int size) {
    capacity=size; // assign the value of size to capacity
    storage = new String[capacity];
  }

  public void show() {
    // the head of the queue starts from array[0] then newer item gets added on tail of another until it reaches its capacity limit
    for (int j=capacity-1; j>=0; j--) {
    for (int i = capacity-1; i >= 0; i--) {
      System.out.println ("Queue [" + j-- + " ]=" + storage [i] );
      /* print like this: 
      queue[9]   = 10th value
      queue[8]   = 9th value
      queue[7]   = 8rd value
      ....  
      queue[1]   = 2nd value
      queue[0]   = 1st value
      */
    }
    }
    System.out.println();
  }
  private boolean isEmpty() {
    if (storage[0] == null) {
      System.out.println ("STORAGE IS EMPTY."); // print error message
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (tail == capacity) {
       System.out.println ("STORAGE IS FULL."); // print error message
       System.out.println();
      return true;
    } 
    return false;
  }

  public void enqueue(String value) {
    if (isFull()) {
      System.out.println ("ADD FAILED."); // print error message
      System.out.println();
    } else {
      System.out.println("... trying to push on queue[" + tail + "] ...");
      storage[tail] = value;
      tail++; /* increment or decrement tail*/;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }
  public void dequeue() {
    if (isEmpty()) {
      System.out.println ("REMOVE FAILED."); // print error message
      System.out.println();
    } else {
      System.out.println("... trying to dequeue queue[" + (head-1) + "] ...");
      storage[tail] = null;
       tail--; /* increment or decrement tail*/;
      System.out.println(storage[head] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[tail] == storage[0]) {
      System.out.println("PEEK TAIL = " + storage[tail]);
      System.out.println();
    } else {
      System.out.println("PEEK TAIL = " + storage[tail-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    ArrayQueue1 storage = new ArrayQueue1(10);
    // construct a new array queue and assign 10 as the integer value for the size limit of the queue
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
    storage.show(); // show empty queue
    storage.dequeue(); // try removing on an empty queue
    storage.peek(); // peek tail element of an empty queue
    storage.enqueue("one");
    storage.show(); // show the updated queue
    storage.peek(); // peek if tail element is "one"
    storage.enqueue("two");
    storage.show(); // show the updated queue
    storage.peek(); // peek if tail element is "two"
    storage.enqueue("three");
    storage.show(); // show the updated queue
    storage.peek(); // peek if tail element is "three"
    storage.enqueue("four");
    storage.show(); // show the updated queue
    storage.enqueue("five"); 
    storage.show(); // show the updated queue
    storage.dequeue(); // try removing "five"
    storage.enqueue("six"); 
    storage.enqueue("seven"); 
    storage.enqueue("eight"); 
    storage.enqueue("nine");    
    storage.enqueue("ten"); 
    storage.show(); // show the updated queue
    storage.peek(); // peek if tail element is "ten"
    storage.enqueue("eleven"); // try adding "eleven"
    storage.enqueue("twelve"); // try adding "twelve"
    storage.show(); // show the updated queue
  }  

}