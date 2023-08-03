
 // Test class implements Runnable interface
class Test implements Runnable
{

    // run() method is starting point of thread 
    public void run() // overrides the run() method available in the Runnable interface
    {
        int i = 1;
        while (i < 50) {

            System.out.println("Implementing Runnable interface : ");
            i++;
        }
    }
}

public class JAVA_03_Runnable_interfaces_01 {

    public static void main(String[] args) {

        // Test class which implementing 'Runnable' interface's object is created
        Test obj1 = new Test();

        // Object of 'Test' class which implementing 'Runnable' interface passed to Thread class's object,
        // because interface unable to 'run()' method, because it is interface ,
        // Thread class provides function to interface's object using Thread class's object

        Thread t1 = new Thread(obj1); // object of class passed to Thread class

        // Start() invokes the run() method on the Thread object along with that 'obj1' object also runs.
        t1.start();

        int i = 1;

        while (i < 50) {

            System.out.println("Main class : ");
            i++;
        }
    }
}

// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Implementing Runnable interface : 
// Implementing Runnable interface : 
// Implementing Runnable interface : 
// Implementing Runnable interface : 
// Implementing Runnable interface : 
// Implementing Runnable interface : 
// Implementing Runnable interface : 
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Implementing Runnable interface :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Implementing Runnable interface :
// Main class :
// Main class :
// Implementing Runnable interface : 
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class : 
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :