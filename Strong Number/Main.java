#include <stdio.h>
int main() {
	int n,i,s=0,m,p;
   
    scanf("%d",&n);
      int b = n;
     while(n>0){
       m=n%10;
       p=1;
       for(i=m;i>=1;i--){
         p=p*i;
        }
       s=s+p;
       n=n/10;
    } if(b == s)
      {printf("Yes");}
      else {
      printf("No");}
	   return 0;
}