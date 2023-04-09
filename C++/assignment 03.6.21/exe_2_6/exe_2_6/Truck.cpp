#include "Truck.h"
#include <string>
#include <iostream>
using namespace std;
Truck::Truck():Car()
{
	this->weight_product = 70;
	Car::set_type("Truck");
}
void Truck::set_weight(int weight_product)
{
	this->weight_product = weight_product;
}
void Truck::show() const
{
	Car::show();
	/*string type = Car::get_type();
	if(type == "Truck")*/
	std::cout << "the weight of product " << this->weight_product << std::endl;
}