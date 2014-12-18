#include <stdio.h>
#include <string.h>
#include <iostream>
using namespace std;

bool isPermutation(char* s1, char* s2){
	int len = strlen(s1);
	if(len != strlen(s2))
		return false;

	int mark[128] = {0};
	int i;

	for(i=0; i<len; ++i, ++s1){
		++mark[*s1];
	}

	for(i=0; i<len; ++i, ++s2){
		if((--mark[*s2]) < 0){
			return false;
		}
	}

	return true;
}

main(){
	char s1[] = "hello";
	char s2[] = "lehol";
	cout << isPermutation(s1, s2);
}