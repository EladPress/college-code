#pragma once
#include <string>
#include "Vehiacle.h"
using namespace std;
class Motorcycle:Vehiacle
{
	
private:
	int wheel_num;

public:
	// constructors
		// null constructor
	Motorcycle();
		// initializing constructor
	Motorcycle(string id, string max_weight);

	// destructor
	~Motorcycle();

	// setter
	void setWheel_num(int wheel_num);

	// getter
	int getWheel_num();

	/// <summary>
	/// Prints the motorcycle's info
	/// </summary>
	void print();
};

