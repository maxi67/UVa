#include <iostream>
#include <string>
using namespace std;

int main(){
	
	string s;
	char A[]={"`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./"};

	while(std::getline(std::cin,s))
	{
		for(int i=0;i<s.size();i++)
		{
			if(s[i]==' ')
					cout << " ";
			for(int j=0; A[j] != '\0'; j++)
				if(s[i]==A[j])
					cout << A[j-1];
		}
		cout << endl;
	}
	
}
