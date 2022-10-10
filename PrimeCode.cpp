// Print Code of N*M 
#include <iostream>
using namespace std;
void print(int n)
{
    if(n==1)
    {
        cout<<n<<" ";
        return ;
    }
    print(n-1) ;
    cout << n << " " ;
}
int main()
{
    print(10) ;
}

output - 1 2 3 4 5 6 7 8 9 10 

// Print n to 1 
#include <iostream>
using namespace std;
void print(int n)
{
    if(n==1)
    {
        cout<<n<<" ";
        return ;
    }
    cout << n << " " ;
    print(n-1) ;
}
int main()
{
    print(10) ;
}

ouput - 10 9 8 7 6 5 4 3 2 1 
