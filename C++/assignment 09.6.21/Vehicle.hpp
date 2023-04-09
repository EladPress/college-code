#ifndef VEHICLE_H
#define VEHICLE_H
#pragma once
	
class Vehicle  
{
	private:
	int id;
	int maxWeight;

	public:

		Vehicle();
		~Vehicle();
		Vehicle(int id, int maxWeight);
		int getId();
		void setId(int id);
		int getMaxWeight();
		void setMaxWeight(int maxWeight);
		virtual void print();
		virtual void printEnviroment();
};
#endif