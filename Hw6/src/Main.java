import java.io.*;

class Main {

   public static void main(String args[]) {

      D d = new D( );

      d.foo((short) 1);

      d.foo(1);

      d.foo((short) 1, d, 1.0); 

      d.bar((short) 1, d, 1.0); 

      d.dPrint( );
   }
}
/*
 * Answers to questions:
 * 1. Error because an interface cannot have a constructor().
 * 
 * 2. i is an instance variable, as for it to be class variable it needs the syntax public static final int i = 1;
 * 	  Since it is an instance variable, every class that implements it will have a copy for it, but it should be final type.
 * 
 * 3. i was declared in I.java
 * 	  i needs to be final, as iterface is just set of rules and should not contain any volatile information.
 * 	  Once declared as final, we cannot assign any value to it in any class that implements it.
 * 
 * 4. My understanding is that the reason we have no error is because, similar method is being inherited from B.java which suffices the
 *    requirement to implement void foo(short) method.
 */