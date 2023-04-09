#include "Motorcycle.hpp"  
#include <iostream>
using namespace std;
Motorcycle::Motorcycle():FourWheeledVehicle()
{
	this->wheelNum = 2;
}
	
Motorcycle::~Motorcycle()
{
	delete(this);
}

Motorcycle::Motorcycle(int id, int maxWeight):FourWheeledVehicle(id, maxWeight)
{
    this->wheelNum = 2;
}