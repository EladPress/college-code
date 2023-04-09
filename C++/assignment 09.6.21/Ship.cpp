#include "Ship.hpp"  
#include <iostream>
using namespace std;
Ship::Ship():Vehicle()
{
	this->name = "default name";
}
	
Ship::~Ship()
{
	delete(this);
}

Ship::Ship(int id, int maxWeight, string name):Vehicle(id, maxWeight)
{
    this->name = name;
}

string Ship::getName()
{
    return this->name;
}

void Ship::setName(string name)
{
    this->name = name;
}

void Ship::print()
{
    Vehicle::print();
    cout << ", name: " << this->getName() << endl;
}

void Ship::printEnviroment()
{
    Vehicle::printEnviroment();
    cout << "on water" << endl;
}