#include "Car.h"
#include "Truck.h"
#include "Bus.h"
#include "Cprivate.h"
#include <string>
#include <iostream>
using namespace std;
int main()
{
	Car *cars[50];
	Car *c = new Car();
	//Truck *t =new Truck();
	//t->show();
	int result=0;
	cout << "1: car" << endl;
	cout << "2: truck" << endl;
	cout << "3: bus" << endl;
	cout << "4: private car" << endl;
	cout << "-1: exit" << endl;
	int i = 0;
	do
	{
		cin >> result;
	} while (result > 4 || result < 1);

	if (result == 1)
	{
		//Car cars[50];
		c = new Car();
	}
	if (result == 2)
	{
		
		c = new Truck();
	}
	if (result == 3)
	{
		//Bus cars[50];
		c = new Bus();

	}
	if (result == 4)
	{
		//Cprivate cars[50];
		c = new Cprivate();
	}
	std::cout << c->get_type() << std::endl;
	for (i = 0; i < 1; i++)
	{
		cars[i] = c;
		std::cout << cars[i]->get_type() << std::endl;
		c->show();
		//cars[i]->show();
		//t->show();
	}
	

	return 0;
}
