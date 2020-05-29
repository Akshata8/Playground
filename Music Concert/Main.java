/* C Program to Count Even and Odd Numbers in an Array */
#include<iostream>
 
int main()
{
 int Size, i, a[10];
 int Even_Count = 0, Odd_Count = 0;
 
 std::cin>>Size;

 for(i = 0; i < Size; i++)
 {
   std::cin>>a[i];
 }
  
 for(i = 0; i < Size; i ++)
 {
   if(a[i] % 2 == 0)
   {
     Even_Count++;
   }
   else
   {
     Odd_Count++;
   }
 }
  
 std::cout<<Odd_Count<<"\n";
 std::cout<<Even_Count;
 return 0;
}
 