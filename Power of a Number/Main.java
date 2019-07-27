#include <stdio.h>
#include<math.h>
int main()
{ int p,e,c;
 scanf("%d",&p);
 scanf("%d",&e);
 if(e>=0)
 {
   c = pow(p,e);
   printf("%d",c);
 }
 else
 {
   printf("Wrong input");
 }
 
    return 0;
}