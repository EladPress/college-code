#include "FourWheelVehiacle.h"
#include <iostream>

// constructors
		// null constructor
FourWheelVehiacle::FourWheelVehiacle() :Vehiacle() {
	this->wheel_num = 4;
}
// initializing constructor
FourWheelVehiacle::FourWheelVehiacle(string id, string max_weight) : Vehiacle(id, max_weight) {
	this->wheel_num = 4;
}

// destructor
FourWheelVehiacle::~FourWheelVehiacle() {}

// getter
int FourWheelVehiacle::getWheel_num() {
	return this->wheel_num;
}

// setter
void FourWheelVehiacle::setWheel_num(int wheel_num) {
	this->wheel_num = wheel_num;
}