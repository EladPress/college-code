#include "Prisoner.h"
#include <string>
#include <iostream>
using namespace std;




Prisoner::Prisoner(std::string firstname, std::string lastname, int yearsInFacility, double pay, int maxVisit)
{
	this->firstname = firstname;
	this->lastname = lastname;
	this->yearsInFacility = yearsInFacility;
	this->pay = pay;
	this->maxVisit = maxVisit;
}
Prisoner::Prisoner(std::string firstname, std::string lastname)
{
	this->firstname = firstname;
	this->lastname = lastname;
}
Prisoner::Prisoner(const Prisoner& prisoner)
{
	this->firstname = prisoner.firstname;
	this->lastname = prisoner.lastname;
	this->yearsInFacility = prisoner.yearsInFacility;
	this->pay = prisoner.pay;
	this->maxVisit = prisoner.maxVisit;

}
Prisoner::Prisoner()
{
	
}
void Prisoner::Print()
{

}
int main()
{
	return 0;
}