#include "Boat.h"
#include <iostream>


// constructors
		// null constructor
Boat::Boat():Vehiacle() {
	this->name = "";
}
// initializing constructor
Boat::Boat(string id, string max_weight, string name) : Vehiacle(id, max_weight) {
	this->name = name;
}

// destructor
Boat::~Boat() {}

// setter
void Boat::setName(string name) {
	this->name = name;
}

// getter
string Boat::getName() {
	return this->name;
}