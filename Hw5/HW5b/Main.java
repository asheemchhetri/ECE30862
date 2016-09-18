import java.io.*;

class Main {

   public static void main(String args[]) {
      char c = 0;
      short s = 1;
      int i = 2;
      float f = 0.0f;
      double df = 1.0;

      B b = new B( );
      D d = new D( );

      System.out.println("Direct calls");
      //d.foo(d, f); error: Cannot find a match
      System.out.println("d.foo(d,f): error");
      //d.foo(c, d, df); error: Cannot find a match
      System.out.println("d.foo(c,d,df): error");
      d.foo(df); //output: "B:foo(double)"
      d.foo(i); //output: "B:foo(float)"
      //d.foo( ); error: Cannot find a match
      System.out.println("d.foo(): error");
      //d.foo(i, d, df); error: Cannot find a match, mainly because a double cannot fit in float
      System.out.println("d.foo(i,d,df): error");
      d.foo(c, b, f); //output: "B:foo(int, B, float)"
      d.foo(f); //output: "B:foo(float)"
      d.foo(c); //output: "B:foo(float)"
      d.foo(s, d, df); //output: "B:foo(short, B, double)"
      //d.foo(i, d); error: Cannot find a match
      System.out.println("d.foo(i,d): error");

      System.out.println("b.caller");
      b.caller( );
      /*
       * error
       * error
       * "B:foo(short)"
       * "B:foo(double)"
       */

   }
}
