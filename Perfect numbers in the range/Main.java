#include<iostream>
int main(){
  int n,i,sum;
  int min,max;
  std::cin>>min>>max>>n;
  for(n=min;n<=max;n++){
    i=1;
    sum=0;
    while(i<n){
      if(n%i==0)
        sum=sum+i;
        i++;
    }
    if(sum==n)
      std::cout<<n<<" ";
  
  }
}