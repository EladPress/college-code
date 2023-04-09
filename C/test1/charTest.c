#include <stdio.h>
#include <string.h>
//find ptr type

void main()
{
    char str1[20] = "question 4";
    char str2[] = "second";
    int i;
    char *ptr;

    ptr = &str1[3];
    printf("%d\n", *ptr - *str1);
    printf("%d\n", ptr - str1);
    printf("%s\n",  ++ptr);
//     printf("%s", _Generic((ptr),                                                 \
//         _Bool: "_Bool",                  unsigned char: "unsigned char",          \
//          char: "char",                     signed char: "signed char",            \
//     short int: "short int",         unsigned short int: "unsigned short int",     \
//           int: "int",                     unsigned int: "unsigned int",           \
//      long int: "long int",           unsigned long int: "unsigned long int",      \
// long long int: "long long int", unsigned long long int: "unsigned long long int", \
//         float: "float",                         double: "double",                 \
//   long double: "long double",                   char *: "pointer to char",        \
//        void *: "pointer to void",                int *: "pointer to int",         \
//       default: "other"));
    ptr[-1] = 0;
    printf("%s\n", str1 + 1);
    
    strcpy(ptr, str1+2);
    
    printf("%s\n", ptr);
    strcat(ptr, str2 + 4);
    printf("%s\n", ptr);
}