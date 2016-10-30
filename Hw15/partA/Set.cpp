#include "Set.h"
#include <iostream>
using namespace std;

unsigned int Set::maskOne[ ] = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096,
                   8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576,
                   2097152, 4194304, 8388608, 16777216, 33554432, 67108864,
                   134217728, 268435456, 536870912, 1073741824, 2147483648};
unsigned int Set::maskZero[ ] = {4294967294, 4294967293, 4294967291, 4294967287, 4294967279,
        4294967263, 4294967231, 4294967167, 4294967039, 4294966783,
        4294966271, 4294965247, 4294963199, 4294959103, 4294950911,
        4294934527, 4294901759, 4294836223, 4294705151, 4294443007,
        4293918719};
unsigned int Set::maskZeros = 0x00000000u;

int Set::copyCount = 0;

Set::Set(int size)
{
   setSize = size;
   numSlots = size/32+1;
   slots = new unsigned int[numSlots];
   for (int i = 0; i < numSlots; i++)	slots[i] = maskZeros;
}

Set::Set(const Set& set)
{
   copyCount++;
   setSize = set.setSize;
   numSlots = set.numSlots;
   slots = new unsigned int[numSlots];
   for (int i = 0; i < numSlots; i++)	slots[i] = set.slots[i];;
}

Set::~Set( ) {delete slots;}

int Set::getCopyCount( ) const {return copyCount;}

Set& Set::operator+(int e) const
{
   int slot = e/32;
   int mask = e % 32;
   Set* tmp = new Set(*this);
   tmp->slots[slot] = tmp->slots[slot] | maskOne[mask];
   return *tmp;
}

Set& Set::operator-(int e) const
{
   int slot = e/32;
   int mask = e % 32;
   Set* tmp = new Set(*this);
   tmp->slots[slot] = tmp->slots[slot] & maskZero[mask];
   return *tmp;
}

Set& Set::operator&(const Set& s) const
{
   Set* tmp = new Set(*this);
   for (int slot = 0; slot < numSlots; slot++)
   {
      tmp->slots[slot] = slots[slot] & s.slots[slot];
   }
   return *tmp;
}

Set& Set::operator~( ) const
{
   Set* tmp = new Set(*this);
   for (int slot = 0; slot < numSlots; slot++)
   {
      tmp->slots[slot] = ~tmp->slots[slot];
   }
   return *tmp;
}

Set& Set::operator/(const Set& diffSet) const
{
   //Set* tmp = new Set(*this);
   return (*this) & (~diffSet);
}

ostream& operator<< (ostream& os, const Set& s)
{
   bool first = true;
   for (int slot = 0; slot < s.numSlots; slot++)
   {
      for (int e = 0; e < 32; e++)
      {
         if (s.slots[slot] & Set::maskOne[e])
         {
            if (first)
            {
               os << slot*32 + e;
               first = false;
            } else
            {
              os << ", " << slot*32 + e;
            }
         }
      }
   }
   os << endl;
   return os;
}
