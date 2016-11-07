#include <iostream>
#include "Mammal.h"
#include "Canine.h"
#include "Pet.h"

using namespace std;

int main() {
	Pet *petPointer = new Pet(4,"Pitbull");
	Pet pet = *petPointer;
	Canine* canineP = petPointer;
	Canine canine = pet;
	Mammal* mammalP = petPointer;
	Mammal mammal = pet;

	cout << "Polymorhpic calls" << endl;
	cout << petPointer->dogBreed() << endl;
	cout << petPointer->getLegs() << endl;
	cout << canineP->dogBreed() << endl;
	cout << canineP->getLegs() << endl;
	cout << mammalP->getLegs() << endl;

	cout << "non-polymorhpic calls" << endl;
	cout << pet.dogBreed() << endl;
	cout << pet.getLegs() << endl;
	cout << canine.dogBreed() << endl;
	cout << canine.getLegs() << endl;
	cout << mammal.getLegs() << endl;
	return 0;
}

