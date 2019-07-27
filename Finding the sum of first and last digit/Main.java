#include <stdio.h>
int main() {
  int n,s,m,sum,h;
  scanf("%d",&n);
  s= n%10;
  while(n>0)
  {m=n%10;
   n=n/10;
   h=m;
  }
  sum =s+h;
  printf("%d",sum);
	return 0;
}