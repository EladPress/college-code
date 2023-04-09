#include "Soldier.h"
#include <string>
#include <iostream>
using namespace std;

Soldier::Soldier(std::string firstname, std::string lastname, int pazam, long ID)
{
	this->firstname = firstname;
	this->lastname = lastname;
	this->pazam = pazam;
	this->ID = ID;
}
Soldier::Soldier(long ID)
{
	this->ID = ID;
}
Soldier::Soldier(long ID, int pazam)
{
	this->ID = ID;
	this->pazam = pazam;
}
Soldier::Soldier(const Soldier& soldier)
{
	this->firstname = soldier.firstname;
	this->lastname = soldier.lastname;
	this->pazam = soldier.pazam;
	this->ID = soldier.ID;
}
Soldier::Soldier()
{

}
std::string Soldier::Print()
{
	return " " + this->firstname + ", " + this->lastname + ", " + std::to_string(this->pazam) + " months, ID: " + std::to_string(this->ID);
}
void Soldier::Q3b()
{
	Soldier soldiers[5];
	soldiers[0] = ("Or", "Grinberg", 3, 987654321);
	soldiers[1] = ("Elad", "Press", 2, 987654322);
	soldiers[2] = ("Yuval", "Press", 24, 123456789);
	soldiers[3] = ("Adir", "Vaknin", 5, 23456789);
	soldiers[4] = ("Tamir", "Musari", 6, 345678912);


	int i;
	int max = 0;
	for (i = 1; i < 5; i++)
	{
		if (soldiers[i].pazam > soldiers[i - 1].pazam)
			max = i;
	}
	cout << "pazamnik = " << soldiers[max].Print() << endl;
	cout << "pazam" << endl;
}

int main()
{
	Soldier::Q3b();
	return 0;
}
