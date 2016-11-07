

#ifndef CANINE_H_
#define CANINE_H_

#include <iostream>
#include "Mammal.h"
using namespace std;

class Canine: public Mammal{
public:
	Canine(int numLegs, string breed);
//	int getLegs();
	virtual ~Canine();
	virtual string dogBreed();
private:
	string breed;
};

#endif /* CANINE_H_ */
