#include <iostream>
int main()
{
  int array[100], maximum, size, c;

  std::cin>>size;
 

  for (c = 0; c <= size; c++)
   std::cin>>array[c];

  maximum = array[0];

  for (c = 1; c < size; c++)
  {
    if (array[c] > maximum)
    {
       maximum  = array[c];
       
    }
  }

  std::cout<<maximum;
  return 0;
}