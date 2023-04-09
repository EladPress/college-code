#pragma once
#include <string>
using namespace std;
class Prisoner
{
	std::string firstname;
	std::string lastname;
	int yearsInFacility;

public:
	double pay;
	int maxVisit;

	Prisoner();
	Prisoner(std::string firstname, std::string lastname, int yearsInFacility, double pay, int maxVisit);
	Prisoner(std::string firstname, std::string lastname);
	Prisoner(const Prisoner& prisoner);
	void Print();

};