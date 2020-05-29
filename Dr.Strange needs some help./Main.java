#include<iostream>
int main(){
  int m,n,req;
  std::cin>>m>>n;
  std::cin>>req;
  req=m*n*req;
  if(req<50){
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
    else{
      std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}