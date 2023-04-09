#pragma once
#include <string>
#include "Vehiacle.h"
using namespace std;
class Boat :Vehiacle
{

private: 
	string name;

public:
	// constructors
		// null constructor
	Boat();
	// initializing constructor
	Boat(string id, string max_weight, string name);

	// destructor
	~Boat();

	// setter
	void setName(string name);

	// getter
	string getName();

};

