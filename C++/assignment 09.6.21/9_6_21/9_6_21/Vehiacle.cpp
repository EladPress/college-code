#include "Vehiacle.h"
#include <iostream>

// constructors
		// null constructor
Vehiacle::Vehiacle() {
	this->id = "";
	this->max_weight = "";
}
// initializing constructor
Vehiacle::Vehiacle(string id, string max_weight) {
	this->id = id;
	this->max_weight = max_weight;
}

// destructor
Vehiacle::~Vehiacle(){}

// getters
	// id getter
string Vehiacle::getID() {
	return this->id;
}
// max_weight getter
string Vehiacle::getMax_weight() {
	return this->max_weight;
}

// setters
	// id setter
void Vehiacle::setID(string id) {
	this->id = id;
}

// max_weight setter
void Vehiacle::setMax_weight(string max_weight) {
	this->id = max_weight;
}

/// <summary>
/// Prints the vehiacle's info
/// </summary>
void Vehiacle::print()
{
	cout << "The Vehiacle id is: "<< this->id << "\nIt's maximum weight capacity is: "<< this->max_weight <<endl;
}




