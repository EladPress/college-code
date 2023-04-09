#include "Man.h"
#include <string>
using namespace std;
#include <iostream>
//using namespace std;

Man::~Man()
{
	delete this;
}
Man::Man(std::string name, int children, long salary, std::string spouse)
{
	this->name = name;
	this->children = children;
	this->salary = salary;
	this->spouse = spouse;
}
Man::Man(const Man& man)
{
	this->name = name;
	this->children = children;
	this->salary = salary;
	this->spouse = spouse;
}
Man Man::operator=(Man man)
{
	return Man(man);
	
}
void Man::Print()
{
	cout << this->name << ", children: " << this->children << ", salary: " << this->salary << ", spouse: " << this->spouse << endl;
}


