#include <iostream>
int main() 
{
	// Type your code here
  int n;
  int rem,rev=0;
  std::cin>>n;
  while(n>0){
    rem=n%10;
    n=n/10;
    rev=rev*10+rem;
   
  }
    std::cout<<rev;
	return 0;

}