
#include <iostream>
using namespace std;

bool isPermutation(string s1, string s2){
	int len = s1.length();
	if(len != s2.length())
		return false;

	int mark[128] = {0};
	int i;

	for(i=0; i<len; ++i){
		++mark[s1.at(i)];
	}

	for(i=0; i<len; ++i){
		if((--mark[s2.at(i)]) < 0)
			return false;
	}

	return true;
}

main(){
	char s1[] = "hello";
	char s2[] = "ohell";
	cout << isPermutation(s1, s2);
}