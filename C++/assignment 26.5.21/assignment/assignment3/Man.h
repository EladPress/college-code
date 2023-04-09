#pragma once
#include <string>
//#include "Woman.h"
using namespace std;
class Man
{
	std::string name;
	int children;
	long salary;
	std::string spouse;

public:
	Man(std::string name, int children, long salary, std::string spouse);
	Man(const Man& man);
	~Man();
	Man operator=(Man man);
	friend class Woman;
	void Print();
};

