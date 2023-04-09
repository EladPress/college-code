#pragma once
using namespace std;
#include <string>
class Soldier
{
	std::string firstname;
	std::string lastname;
	int pazam;
	long ID;

public:
	Soldier(std::string firstname, std::string lastname, int pazam, long ID);
	Soldier(long ID);
	Soldier(long ID, int pazam);
	Soldier(const Soldier& soldier);
	Soldier();
	std::string Print();
	static void Q3b();
};

