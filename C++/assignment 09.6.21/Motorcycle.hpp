#ifndef MOTORCYCLE_H
#define MOTORCYCLE_H
#include "FourWheeledVehicle.hpp"
#pragma once
	
class Motorcycle : public FourWheeledVehicle
{
	private:

	public:

		Motorcycle();
		~Motorcycle();
		Motorcycle(int id, int maxWeight);
		virtual void print();
		virtual void printEnviroment();

};
#endif