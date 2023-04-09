#pragma once
#include <string>
#include "Vehiacle.h"
using namespace std;
class FourWheelVehiacle:Vehiacle
{

private:
	int wheel_num;

public:
	// constructors
		// null constructor
	FourWheelVehiacle();
	// initializing constructor
	FourWheelVehiacle(string id, string max_weight);

	// destructor
	~FourWheelVehiacle();

	// setter
	void setWheel_num(int wheel_num);

	// getter
	int getWheel_num();
};

