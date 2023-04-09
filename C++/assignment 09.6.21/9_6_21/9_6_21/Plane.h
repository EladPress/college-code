#pragma once
#include <string>
#include "Vehiacle.h"
using namespace std;
class Plane:Vehiacle
{

private:
	int num_engines;

public:
	// constructors
		// null constructor
	Plane();
	// initializing constructor
	Plane(string id, string max_weight, int num_engines);

	// destructor
	~Plane();

	// setter
	void setNum_engines(int num_engines);

	// getter
	int getNum_engines();
};

