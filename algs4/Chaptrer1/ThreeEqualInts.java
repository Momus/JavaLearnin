import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ThreeEqualInts { 

    /**
     * 1.1.3 Write a program that takes three integer command-line
     * arguments and prints equal if all three are equal, and not equal
     * otherwise.
     * 
     */

  
    public static void main(String[] args) {

        int one   = Integer.parseInt(args[0]);
        int two   = Integer.parseInt(args[1]);
        int three = Integer.parseInt(args[2]);
    
        // The lesson here is that (a == b == c) does not work
        if ((one == two) && (two == three)){
            StdOut.println("equal"); }
        else {
            StdOut.println("not equal");
                }

        
    }
}

