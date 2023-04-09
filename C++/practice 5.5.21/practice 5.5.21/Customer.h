#include <string>
#pragma once
class Customer
{
	std::string name;
	int age;
	enum Sex { Female, Male, AttackHelicopter }; Sex sex;
	int income;
public:
	Customer();
	Customer(std::string name, Sex sex);
	Customer(std::string name, int age, Sex sex, int income);
};



