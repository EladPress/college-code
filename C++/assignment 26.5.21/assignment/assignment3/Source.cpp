#include "Man.h"
#include "Woman.h"
#include <iostream>

int main()
{
	Man man1("Barak", 2, 5500, "Inbal");
	Man man2 = man1;
	Woman woman1;
	Woman woman2("Lilach", 2, 7, "Guy");
	//Woman woman3("Inbal", 5, 10, man2);
	//man1.print();
}