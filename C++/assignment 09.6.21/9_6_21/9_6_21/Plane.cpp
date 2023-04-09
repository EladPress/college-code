#include "Plane.h"
#include <iostream>


// constructors
		// null constructor
Plane::Plane() :Vehiacle() {
	this->num_engines = 0;
}
// initializing constructor
Plane::Plane(string id, string max_weight, int num_engines) : Vehiacle(id, max_weight) {
	this->num_engines = num_engines;
}

// destructor
Plane::~Plane() {}

// setter
void Plane::setNum_engines(int num_engines) {
	this->num_engines = num_engines;
}

// getter
int Plane::getNum_engines() {
	return this->num_engines;
}