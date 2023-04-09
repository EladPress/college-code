#include "Car.h"
#include <string>
#include <iostream>
using namespace std;

Car::Car()
{
	this->id_car=12345;//מספר רכב
	this->persons = 4;
	this->type = "Car";
}
Car::~Car()
{
}
void Car::set_id(int id_car)
{
	this->id_car = id_car;
}
void Car::set_persons(int persons)
{
	this->persons = persons;
}
void Car::set_type(string type)
{
	this->type = type;
}

string Car::get_type()
{
	return (this->type);
}
void Car::show() const
{
	std::cout << "the id car is " << this->id_car << " and in the car are " << this->persons << " persons. " << std::endl;
}

