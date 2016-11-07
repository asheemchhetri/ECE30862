#include "Mammal.h"

Mammal::Mammal(int legNum): legs(legNum) {};
int Mammal::getLegs(){
	return legs;
}
Mammal::~Mammal( ) { };
