#include<iostream>
int main(){
 
  int a,b,res;
  int ch;
 
  std::cin>>a>>b;
  std::cout<<"Enter first number : Enter second number : Menu\n";
  std::cout<<"1.Addition\n";
  std::cout<<"2.Subtraction\n";
  std::cout<<"3.Multiplication\n";
  std::cout<<"4.Division\n";
  std::cout<<"5.Remainder\n";
  std::cin>>ch;
 switch(ch){
      case 1:
     {
       std::cin>>a>>b;
       res=a+b;
       std::cout<<res;
     }
        break;
       case 2:
     {
       std::cin>>a>>b;
       res=a-b;
       std::cout<<res;
     }
        break;
       case 3:
     {
       std::cin>>a>>b;
       res=a*b;
       std::cout<<res;
     }
        break;
   case 4:
     {
       std::cin>>a>>b;
       res=a/b;
       std::cout<<res;
     }
        break;
       case 5:
     {
       std::cin>>a>>b;
       res=a%b;
       std::cout<<res;
     }
        break;
   default:
     std::cout<<"Invalid operation";
 }
}
        
        