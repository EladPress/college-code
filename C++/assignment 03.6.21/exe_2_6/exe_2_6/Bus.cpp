#include "Bus.h"
#include <string>
#include <iostream>
using namespace std;
Bus::Bus():Car()
{
	this->lender = "sdfghj";
	Car::set_type("Bus");
}
void Bus::set_lender(string lender)
{
	this->lender = lender;
}
void Bus::show()
{
	Car::set_type("Bus");
	string type = Car::get_type();
	Car::show();
	if(type=="Bus")
		std::cout << "lender: " << this->lender << std::endl;
}
