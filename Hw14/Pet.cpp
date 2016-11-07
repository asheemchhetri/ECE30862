#include "Pet.h"
#include <sstream>

Pet::Pet(int numLegs, string breed): Canine(numLegs,breed) {};
string Pet::dogBreed()
{
		stringstream info;
		info << "AKC: ";
		info << Canine::dogBreed();
		return info.str();
}
Pet::~Pet( ) { };

