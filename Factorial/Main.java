#include<iostream>
long int multiplyNumbers(int n);
int main() {
    int n;
    std::cin>>n;
    std::cout<<"The factorial of"<<" "<<n<<" "<<"is"<<" "<<multiplyNumbers(n);
    return 0;
}

long int multiplyNumbers(int n) {
    if (n>=1)
        return n*multiplyNumbers(n-1);
    else
        return 1;
}