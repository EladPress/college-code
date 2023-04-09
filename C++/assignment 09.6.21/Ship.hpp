#ifndef SHIP_H
#define SHIP_H
#include "Vehicle.hpp"
#include <string>
using namespace std;
#include <iostream>
#pragma once
	
class Ship : public Vehicle
{
	private:
	string name;
	public:

		Ship();
		~Ship();
		Ship(int id, int maxWeight, string name);
		string getName();
		void setName(string name);
		virtual void print();
		virtual void printEnviroment();

};
#endif