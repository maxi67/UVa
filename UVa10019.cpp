#include <iostream>
using namespace std;

int main(){
	int a, b, c, bb, he;
	int sum, sum2;
	
	cin >> a;
	
	while (a--){
		
		sum = 0;sum2 = 0;he=0;
		cin >> bb;
		
		b = bb;
		
		while(b >= 1){  
			if(b%2)  sum += 1 ;
			b/=2;
		}
		cout << sum << " ";
		
		c = bb;
		
		while (c >= 1){
			he = c%10;
			while (he>=1) { if(he%2) sum2+=1; he/=2; }
			c /= 10;	
		}
		cout << sum2 << endl;
	}
}
