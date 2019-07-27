#include <stdio.h>
int main() {
	int n ,i,m=1;
   scanf("%d",&n);
  for(i=n;i>=1;i--){
       m =m*i;
  }
  printf("%d",m);
	return 0;
}