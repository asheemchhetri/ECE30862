#ifndef PET_H_
#define PET_H_

#include <iostream>
#include "Canine.h"
using namespace std;

class Pet: public Canine {
public:
	Pet(int numLegs, string breed);
	virtual ~Pet();
	string dogBreed();
};

#endif /* PET_H_ */
