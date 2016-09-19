// A simple demonstration of the existence of the Object class 
// and the hashCode method defined by the Object class.
class Any extends Object implements Comparable {

   final double value;

   public Any( ) {
      value = hashCode( );
   }
   public double value()
   {
	   return value;
   }
   public boolean lessThan(Comparable c)
   {
	   if(this.value < c.value())
	   {
		   return true;
	   }
	   else return false;
   }
   public boolean equal(Comparable c)
   {
	   return (this.value == c.value()? true:false);
   }
   public boolean greaterThan(Comparable c)
   {
	   return (this.value > c.value() ? true:false);
   }

}
