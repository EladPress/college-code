#include <stdio.h>
#include <math.h>
#define N 3
void create_matrix(int vec[], int mat[][10], int *size)
{
int i, j, vec_len ;
vec_len = 0 ;
while (vec[vec_len] != -1) vec_len++ ;
(*size) = sqrt(vec_len) + 1 ;
for (i=0 ; i<(*size) ; i++)
for (j=0 ; j<(*size) ; j++)
{
if ((vec[(*size) * i + j] != -1) && (((*size) * i + j)<vec_len))
mat[i][j] = vec[(*size) * i + j ] ;
else mat[i][j] = -1 ;
}
}
void main()
{
int vec1[11] = {6,4,9,8,9,1,14,26,34,58,-1} ;
int i, j, size ;
int mat[10][10] ;
create_matrix(vec1, mat, &size) ;
printf(" the input vector is : \n\n ") ;
for (i=0 ; vec1[i] != -1 ; i++) printf("%d ", vec1[i]) ;
printf("\n\n\nthe output matrix is : \n") ;
for(i=0 ; i<size ; i++)
{
printf("\n ") ;
for(j=0 ; j<size ; j++) printf("%3d ", mat[i][j]) ;
}
return 0 ;
}