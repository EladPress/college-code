#include <stdio.h>

void main()
{
    
//כיצד תראה מפת הזיכרון בתום ביצוע קטע התוכנית הבא ?
int a, b, c=8;
int *p1, *p2 ;

//a = 8;
p1=&a;
//printf("%d, %d", p1, &a);
*p1=3;
p2=p1;
*p2=a+3;
printf("%d\n", *p2);
p2++;
printf("%d", *p2);
*p2--;
 if (*(p1+2)==7)		p2=&c;
 if ((*p1+2)==7)		p2=&c;
c=*p1;



}
