package dev;

/* Java program to implement basic stack
        operations */


// Driver code
public class Main {
    public static void main(String args[]) {
        System.out.println(method(17));
//        Stack s = new Stack();
////    int i =0;
////        while (++i<2000) {
//            s.push(10);
//            s.push(20);
//            s.push(30);
////        }
//        System.out.println(s.pop() + " Popped from stack");
    }


    static boolean method(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}