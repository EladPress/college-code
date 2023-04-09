#include "Motorcycle.h"
#include <iostream>



// constructors
		// null constructor
Motorcycle::Motorcycle():Vehiacle() {
	this->wheel_num = 2;
}
// initializing constructor
Motorcycle::Motorcycle(string id, string max_weight):Vehiacle(id,max_weight) {
	this->wheel_num = 2;
}

// destructor
Motorcycle::~Motorcycle() {}

// getter
int Motorcycle::getWheel_num() {
	return this->wheel_num;
}

// setter
void Motorcycle::setWheel_num(int wheel_num) {
	this->wheel_num = wheel_num;
}

void Motorcycle::print() {
	cout<< "The vehiacle type is Motorcycle\n It's got 2 wheels"<<endl;
	Vehiacle::print();
}