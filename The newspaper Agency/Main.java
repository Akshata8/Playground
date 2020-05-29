#include<iostream>

int main()
{
  //Type your code here.
  int w,x,y,profit=0;
  std::cin>>w>>x>>y;
  
  profit=((w*x)-(w*y))-100;
  std::cout<<profit;
}
