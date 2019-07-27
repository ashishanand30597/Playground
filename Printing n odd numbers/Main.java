#include <stdio.h>
int main() { 
int n,l,s,d=2,a=1;
  scanf("%d",&n);
  for(l=1;l<=n;l++)
  { s= a+(l-1)*d;
   printf("%d\n",s);
  }
	return 0;
}