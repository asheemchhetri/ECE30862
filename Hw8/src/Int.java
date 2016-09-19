import java.lang.Integer;

class Int implements Comparable {

   Integer i;

   public Int(int j) {i = new Integer(j);}

   // Implement the Comparable interface functions here.
   public double value()
   {
	   return i.doubleValue();
   }
   public boolean lessThan(Comparable c)
   {
	   if(i.doubleValue() < c.value())
	   {
		   return true;
	   }
	   else return false;
   }
   public boolean equal(Comparable c)
   {
	   return (i.doubleValue() == c.value()? true:false);
   }
   public boolean greaterThan(Comparable c)
   {
	   return (i.doubleValue() > c.value() ? true:false);
   }

}
