#include <iostream>
#include "Boat.h"
#include "FourWheelVehiacle.h"
#include "Motorcycle.h"
#include "Plane.h"
#include "Vehiacle.h"


int main() {
	
	Motorcycle *moto = new Motorcycle("12", "555");
	moto->print();


	return 0;
}