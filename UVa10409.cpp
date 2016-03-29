#include <iostream>
#include <string>
using namespace std;

int main(){
	
	int temp, times;
	string a;
	
	while(cin >> times, times)
	{
		int u=1,d=6,n=2,s=5,w=3,e=4; //init
		while(times--){
			cin >> a;
			switch(a[0]){
			
				case 'n':
					temp=u;u=s;s=d;d=n;n=temp; 
					break;
				case 's': 
					temp=u;u=n;n=d;d=s;s=temp;
					break;
				case 'e': 
					temp=u;u=w;w=d;d=e;e=temp;
					break;
				case 'w': 
					temp=u;u=e;e=d;d=w;w=temp;
					break;
				default : break;
			
			}
		}
		
		cout << u << endl;
			
	}
	
}
