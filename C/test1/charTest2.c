#include <stdio.h>

void main()
{
//     char *p[2][3]={"abc","defg","hi","jklmno","pqrstuvw","xyz"};
//     printf("%c \n", ***p);
// printf("%c \n", **p[1]);
// printf("%s \n", *p[1]);
// printf("%c \n", *(p[1][2]+2));

char *p[2][3] = {"question" , "number" , "4" , "good" , "luck" , "!!!" } ;
printf("%s\n", *p[0]+5 ) ;
printf("%c\n", *(p[1][2]+2) ) ;
 printf("%c\n", **p[1]) ;


}