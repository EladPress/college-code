#pragma once
#include <string>
#include <iostream>
using namespace std;
class Car
{
	int id_car;//���� ���
	int persons;//���� ����� ����

	string type;

public:
	Car();
	~Car();
	void set_id(int id_car);
	void set_persons(int persons);
	void set_type(string type);
	string get_type();
	void show() const;
};

