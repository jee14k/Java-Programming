import java.util.LinkedList; 
public class Producer_Consumer
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
        final Test obj = new Test(); 
        Thread t1 = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                try
                { 
                    obj.produce(); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
        Thread t2 = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                try
                { 
                    obj.consume(); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
        t1.start(); 
        t2.start();
        t1.join(); 
        t2.join(); 
    } 
public static class Test 
    { 
        LinkedList<Integer> list = new LinkedList<>(); 
        int capacity = 2; 

        public void produce() throws InterruptedException 
        { 
            int value = 0; 
            while (true) 
            { 
                synchronized (this) 
                { 
                    while (list.size()==capacity) 
                        wait(); 
  
                    System.out.println("Produced item-"
                                                  + value); 
                    list.add(value++);
                    notify(); 
                    Thread.sleep(500); 
                } 
            } 
        } 
  
        public void consume() throws InterruptedException 
        { 
            while (true) 
            { 
                synchronized (this) 
                { 
                    while (list.size()==0) 
                        wait(); 
                    int val = list.removeFirst(); 
  
                    System.out.println("Consumed item-"
                                                    + val); 
                    notify();
                    Thread.sleep(500); 
                } 
            } 
        } 
    } 
} 