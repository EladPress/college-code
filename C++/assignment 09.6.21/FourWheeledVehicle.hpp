#ifndef FOURWHEELEDVEHICLE_H
#define FOURWHEELEDVEHICLE_H
#include "Vehicle.hpp"
#pragma once
	
class FourWheeledVehicle : public Vehicle
{
	private:
	static int wheelNum;
	public:

		FourWheeledVehicle();
		~FourWheeledVehicle();
		FourWheeledVehicle(int id, int maxWeight);
		int getWheelNum();
		virtual void print();
		virtual void printEnviroment();
		friend class Motorcycle;

};
#endif