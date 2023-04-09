#include "Woman.h"
#include "Man.h"
#include <string>
#include <iostream>
using namespace std;

Woman::Woman(std::string name, int children, int numOfDishwashingPerWeek, Man spouse, long salary)
{
	this->name = name;
	this->children = children;
	this->numOfDishwashingPerWeek = numOfDishwashingPerWeek;
	this->spouse = spouse;
	this->salary = salary;
}
Woman::Woman(std::string name, int children, int numOfDishwashingPerWeek, std::string spouse)
{
	this->name = name;
	this->children = children;
	this->numOfDishwashingPerWeek = numOfDishwashingPerWeek;
	this->spouse.name = spouse;
	this->salary = 7000;
}
Woman::Woman()
{

}
Woman::~Woman()
{
	delete this;
}
Woman::Woman(const Woman& woman)
{
	this->name = woman.name;
	this->children = woman.children;
	this->numOfDishwashingPerWeek = woman.numOfDishwashingPerWeek;
	this->spouse = woman.spouse;
	this->salary = woman.salary;

}
Woman Woman::operator=(Woman woman)
{
	return Woman(woman);
}
