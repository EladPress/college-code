#pragma once
#include <string>

using namespace std;
class Vehiacle
{

private:
	// variables
	string id, max_weight;
	string type;

public:
	// constructors
		// null constructor
	Vehiacle();
		// initializing constructor
	Vehiacle(string id, string max_weight);

	// destructor
	~Vehiacle();

	// getters
		// id getter
	string getID();
		// max_weight getter
	string getMax_weight();



	// setters
		// id setter
	void setID(string id);
		// max_weight setter
	void setMax_weight(string max_weight);

	/// <summary>
	/// Prints The info of the vehiacle
	/// </summary>
	virtual void print();
};

