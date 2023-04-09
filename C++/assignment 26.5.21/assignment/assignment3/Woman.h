#pragma once
#include <string>
//#include "Man.h"
using namespace std;
class Woman
{
	std::string name;
	int children;
	int numOfDishwashingPerWeek;
	Man spouse;
	long salary;
	
public:
	Woman(std::string name, int children, int numOfDishwashingPerWeek, Man spouse, long salary);
	Woman(std::string name, int children, int numOfDishwashingPerWeek, std::string spouse);
	Woman();
	~Woman();
	Woman(const Woman& woman);
	Woman operator=(Woman woman);
	friend class Man;
};

