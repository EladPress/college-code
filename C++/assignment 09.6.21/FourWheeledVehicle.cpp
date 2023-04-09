#include "FourWheeledVehicle.hpp"  
#include <iostream>
using namespace std;
	
FourWheeledVehicle::FourWheeledVehicle():Vehicle()
{
	this->wheelNum = 4;
}
	
FourWheeledVehicle::~FourWheeledVehicle()
{
	delete(this);
}

FourWheeledVehicle::FourWheeledVehicle(int id, int maxWeight):Vehicle(id, maxWeight)
{
    this->wheelNum = 4;
}

int FourWheeledVehicle::getWheelNum()
{
    return this->wheelNum;
}

void FourWheeledVehicle::print()
{
    Vehicle::print();
    cout << ", number of wheels: " << this->getWheelNum()<< endl;
}

void FourWheeledVehicle::printEnviroment()
{
    Vehicle::printEnviroment();
    cout << " on land" << endl;
}