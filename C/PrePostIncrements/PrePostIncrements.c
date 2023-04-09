#include <stdio.h>
void main ()
{

	int a;
	int b;
	int c;
	
	b=5; 
	a=++b; // b=6, a=b, a=6
	printf("1) a=%d , b=%d \n" ,a,b );
	
	b=5; 
	a=--b; // b=4, a=b, a=4
	printf("2) a=%d , b=%d \n" ,a,b );
	
	b=5; c=7;
	a=++b*c--; // b=6, a=b*c, a=6*7=42, c=6
	printf("3) a=%d , b=%d, c=%d \n" ,a,b,c );
	
	b=5; 
	a=++b*++b; // b=6, b=7, a=b*b, a=7*7=49
	printf("4) a=%d , b=%d \n" ,a,b );
	
	c=7;
	a=0 || ++c; // c=8, a=1
	printf("5) a=%d , c=%d \n" ,a,c );
	
	c=7; b=0;
	a=b || ++c; // c=8, a=1
	printf("6) a=%d , b=%d, c=%d \n" ,a,b,c );
	
	b=5; c=7;
	a=b>2 || ++c; // a=1, c=7
	printf("7) a=%d , b=%d, c=%d \n" ,a,b,c );
	
	b=5; c=7;
	a=b>2 && ++c; // a=1, c=8
	printf("8) a=%d , b=%d, c=%d \n" ,a,b,c );
	
	b=0; c=7;
	a=b && ++c; //  a=0, c=7
	printf("9) a=%d , b=%d, c=%d \n" ,a,b,c );
	
	b=2; c=5;
	a=b+++c; // b=2, c=5, a=b+c, a=2+5=7, b=8
	printf("10) a=%d , b=%d, c=%d \n" ,a,b,c );
	
	b=2; c=5;
	a=b+ ++c; //b=2, c=6, a=b+c, a=2+6
	printf("11) a=%d , b=%d, c=%d \n" ,a,b,c );
	
}

