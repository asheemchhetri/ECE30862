#ifndef SET_H_
#define SET_H_
#include <string>
using namespace std;

class Set {
public:
   Set(int size); 
   Set(const Set& set); 
   virtual ~Set();
   static unsigned int getOneMask(int e);
   static unsigned int getZeroMask(int e);
   static unsigned int getZerosMask(int e);
   static int getCopyCount( );
   static void setCopyCount(int e);
   
   virtual unsigned int getSlot(int slot) const;
   virtual void setSlot(int slot, unsigned int value) const;
   virtual int getNumSlots( ) const;

   friend Set& operator+(const Set& s, int e);
   friend Set& operator-(const Set& s, int e);
   friend Set& operator&(const Set& l,const Set& r);
   friend Set& operator~(const Set& s);
   friend Set& operator/(const Set& l, const Set& r);
   friend ostream& operator<< (ostream& os, const Set& c);
private:
   int setSize;
   int numSlots;
   unsigned int* slots;
   static unsigned int maskOne[ ];
   static unsigned int maskZero[ ];
   static unsigned int maskZeros;
   static int copyCount;
};

#endif /*SET_H_*/
