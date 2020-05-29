#include<iostream>
int main(){
  int max_weight,weight_flor;
  std::cin>>max_weight>>weight_flor;
   if(max_weight>weight_flor){
  
    std::cout<<"Yes, you can enter."<<"\n";
   }
else if(max_weight<weight_flor)
      std::cout<<"Sorry, you can't enter"<<"\n";

  else
    std::cout<<"Yes, you can enter. Kindly use a rope.";


  
}