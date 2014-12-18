#include <stdio.h>
#include <string.h>
#include <iostream>
using namespace std;

void replaceSpaces(char* str, int length){
	int i;
	char buf[length];

	strcpy(buf, str);
	cout << "str = " << str << ", buf = " << buf << endl;
	for(i=0; i<length; ++i, ++str){
		if(buf[i] == ' '){
			*str++ = '%';
			*str++ = '2';
			*str = '0';
		}else{
			*str = buf[i];
		}
	}
}

void replaceSpaces2(char str[], int length){
	int i, newlength, spaceCount = 0;

	for(i=0; i<length; ++i){
		if(str[i] == ' ') ++spaceCount;
	}
	newlength = length + 2 * spaceCount;
	str[newlength] = 0;

	for(i=length-1; i>=0; --i){
		if(str[i] == ' '){
			str[--newlength] = '0';
			str[--newlength] = '2';
			str[--newlength] = '%';			
		}else{
			str[--newlength] = str[i];
		}
	}
}

main(){
	char s1[] = "hello world!       ";
	replaceSpaces2(s1, 12);
	cout << s1;
}