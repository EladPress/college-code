#include <iostream>

using namespace std;
template <class T> T avg(T arr[5])
{
    int i, sum = 0;
    for(i = 0; i < 5; i++)
    {
        sum += arr[i];
    }
    sum /= 5;
    return sum;
}
int main()
{
    //cout << max(50, 70) << endl;
    int arr[] = {1, 2, 3, 4, 5};
    cout << avg(arr) << endl;
}
template <class T> T max(T a, T b)
{
    if(a > b)
        return a;
    return b;
}

