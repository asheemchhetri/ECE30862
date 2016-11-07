

#ifndef MAMMAL_H_
#define MAMMAL_H_

#include <iostream>
using namespace std;

class Mammal {
public:
	Mammal(int legNum);
	virtual ~Mammal();
	virtual int getLegs() final;
private:
	int legs;
};

#endif /* MAMMAL_H_ */
