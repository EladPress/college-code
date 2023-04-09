#pragma once
#include "Car.h"
#include <string>
using namespace std;

class Bus:public Car
{
	string lender;

public:
	Bus();
	void set_lender(string lender);
	void show();
};

