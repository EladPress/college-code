#pragma once
#include "Car.h"
#include <string>
using namespace std;

class Truck:public Car
{
	int weight_product;//משקל מוצרים

public:
	Truck();
	void set_weight(int weight_product);
	void show() const;

};

