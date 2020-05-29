#include <iostream>
int main ()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  c=a+b;
  std::cout <<"a+b="<<c<<"\n";
  c=a-b;
  std::cout <<"a-b="<<c<<"\n";
  c=a*b;
  std::cout <<"a*b="<<c<<"\n";
  c=a/b;
  std::cout <<"a/b="<<c<<"\n";
  c=a%b;
  std::cout<<"a%b="<<c;
}