#include "Plane.hpp"  
#include "Vehicle.hpp"
#include <iostream>
using namespace std;
	
Plane::Plane():Vehicle()
{
	this->engineNum = 2;
}
	
Plane::~Plane()
{
	delete(this);
}

Plane::Plane(int id, int maxWeight, int engineNum):Vehicle(id, maxWeight)
{
    this->engineNum = engineNum;
}

int Plane::getEngineNum()
{
	return this->engineNum;
}

void Plane::print()
{
	Vehicle::print();
	cout << ", number of engines: " << this->getEngineNum() << endl;
}

void Plane::printEnviroment()
{
	Vehicle::printEnviroment();
	cout << " in the air" << endl;
}