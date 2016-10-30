#ifndef SET_H_
#define SET_H_
#include <string>
using namespace std;

class Set {
public:
   Set(int size); 
   Set(const Set& set); 
   virtual ~Set();

   virtual int getCopyCount( ) const;

   virtual Set& operator+(int e) const;
   virtual Set& operator-(int e) const;
   virtual Set& operator&(const Set& s) const;
   virtual Set& operator~( ) const;
   virtual Set& operator/(const Set& s) const;
   
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
