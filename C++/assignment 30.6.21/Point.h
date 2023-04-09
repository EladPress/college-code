#pragma once

class Point
{
    int x;
    int y;
public:
	Point();
    Point(int x, int y);
	~Point();// = default;
    void SetX(int x);
    void SetY(int y);
    int GetX();
    int GetY();;
    void operator++();
    void operator++(int);
    
    
};
