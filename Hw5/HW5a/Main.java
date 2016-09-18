import java.io.*;

class Main {

   public static void main(String args[]) {
      C0 c01 = new C0( );
      C0 c02 = new C0(1,2);
      C1 c11 = new C1( );
      C1 c12 = new C1(3, 4, 5.0f);

      System.out.println("c01.a.intValue( ): " + c01.a.intValue( )); //output: 0
      System.out.println("c01.b.intValue( ): " + c01.b.intValue( )); //output: 0
      System.out.println("c01.x: " + c01.getX());// Had to convert it to a getter, as x is a private instance variable in C0. output: 0 
      System.out.println("c01.y: " + c01.getY());// Had to convert it to a getter, as y is a private instance variable in C0. output: 0

      System.out.println("c02.a.intValue( ): " + c02.a.intValue( )); //output: 1
      System.out.println("c02.b.intValue( ): " + c02.b.intValue( )); //output: 2
      System.out.println("c02.x: " + c02.getX()); // Had to convert it to a getter, as x is a private instance variable in C0. output: -1
      System.out.println("c02.y: " + c02.getY()); // Had to convert it to a getter, as y is a private instance variable in C0. output: -2

      System.out.println("c11.a.intValue( ): " + c11.a.intValue( )); //output: 0
      System.out.println("c11.b.intValue( ): " + c11.b.intValue( )); //output: 0
      System.out.println("c11.c.floatValue( ): " + c11.c.floatValue( )); // output: 1.5
      System.out.println("c11.x: " + c11.getX()); //Had to convert it to a getter, as x is a private instance variable in C0. output: 0
      System.out.println("c11.y: " + c11.y); // output: 0
      System.out.println("c11.z: " + c11.getZ()); //Had to convert it to a getter, as x is a private instance variable in C1. output: 1.5

      c01 = c12;
      System.out.println("c12.a.intValue( ): " + c01.a.intValue( )); // output: 3
      System.out.println("c12.b.intValue( ): " + c01.b.intValue( )); // output: 4
      System.out.println("c12.c.floatValue( ): " + ((C1) c01).c.floatValue( )); // output: 5.0
      System.out.println("c12.x: " + c01.getX());//Had to convert it to a getter, as x is a private instance variable in C1. output: 0
      System.out.println("c12.y: " + c01.getY());//Had to convert it to a getter, as y is a private instance variable in C1. output: 1
      System.out.println("c12.z: " + c12.getZ()); //Gives error. Looks in C0 initially, had to be changed to c12.z. output: 5.0
      System.out.println("c02.getA( ): " + c02.getA( ));// output: -1 Class: C0
      System.out.println("c02.getB( ): " + c02.getB( ));// output: -2 Class: C0
      System.out.println("c02.getX( ): " + c02.getX( ));// output: -1 Class: C0
      System.out.println("c02.getY( ): " + c02.getY( ));// output: -2 Class: C0

      System.out.println("c12.getA( ): " + c01.getA( ));// output: -3 Class: C0
      System.out.println("c12.getB( ): " + c01.getB( ));// output: -4 Class: C0
      System.out.println("c12.getC( ): " + ((C1) c01).getC( ));// output: 5.0 Class: C1
      System.out.println("c12.getX( ): " + c01.getX( ));// output: 0 Class: C0
      System.out.println("c01.getY( ): " + c01.getY( ));// output: 1 Class: C1
      System.out.println("c01.getZ( ): " + c01.getY( ));// output: 1 Class: C1
      
   }
}
