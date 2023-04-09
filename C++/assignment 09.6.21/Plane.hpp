#ifndef PLANE_H
#define PLANE_H
#include "Vehicle.hpp"
#pragma once
	
class Plane : public Vehicle
{
	private:
	int engineNum;
	public:

		Plane();
		~Plane();
		Plane(int id, int maxWeight, int engineNum);
		int getEngineNum();
		virtual void print();
		virtual void printEnviroment();

};
#endif