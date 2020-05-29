#include<iostream>
int main(){
  float mile;
  int ltrs,d,dist;
  std::cin>>mile>>ltrs>>d;
  dist=mile*ltrs;
  if(dist>=d){
    std::cout<<"Can reach";
  }
    else{
      std::cout<<"Cannot reach";
  }
}
