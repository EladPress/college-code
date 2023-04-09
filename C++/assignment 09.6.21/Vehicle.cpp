#include "Vehicle.hpp"  
#include <string>
#include <iostream>
#include <typeinfo>
using namespace std;
Vehicle::Vehicle()
{
	this->maxWeight = 10000;
    id = 0;
}
	
Vehicle::~Vehicle()
{
	delete(this);
}
Vehicle::Vehicle(int id, int maxWeight)
{
    this->id = id;
    this->maxWeight = maxWeight;
}

int Vehicle::getId()
{
    return this->id;
}
void Vehicle::setId(int id)
{
    this->id = id;
}
int Vehicle::getMaxWeight()
{
    return this->maxWeight;
}
void Vehicle::setMaxWeight(int maxWeight)
{
    this->maxWeight = maxWeight;
    
}
void Vehicle::print()
{
    cout << "type: " << typeid(this).name() << ", id: " << this->getId() << ", max weight: " << this->getMaxWeight() << endl;
}
void Vehicle::printEnviroment()
{
    cout << "this vehicle moves ";
}