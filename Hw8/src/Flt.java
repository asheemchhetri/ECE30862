import java.lang.Float;

public class Flt implements Comparable {

   Float f; // the value returned by the value method.

   public Flt(float f) {this.f = new Float(f);}
   public double value()
   {
	   return f.doubleValue();
   }
   public boolean lessThan(Comparable c)
   {
	   if(f.doubleValue() < c.value())
	   {
		   return true;
	   }
	   else return false;
   }
   public boolean equal(Comparable c)
   {
	   return (f.doubleValue() == c.value()? true:false);
   }
   public boolean greaterThan(Comparable c)
   {
	   return (f.doubleValue() > c.value() ? true:false);
   }
}
