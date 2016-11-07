

#include "Canine.h"

Canine::Canine(int numLegs, string breed):Mammal(numLegs), breed(breed){};

string Canine::dogBreed(){
	return breed;
}
Canine::~Canine( ) { };
