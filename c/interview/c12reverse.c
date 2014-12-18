#include <stdio.h>
#include <string.h>

// With return value
void reverse2(char* str){
	int len = strlen(str);
	char* p = str;
	int i;
	char buff[len+1];
	
	for(i=0; i<len; ++i,++p){
		buff[len-i-1] = *p;
	}
	// buff[len] = 0;

	for(i=0; i<len; ++i,++str){
		*str = buff[i];
	}

	// strcpy(str, buff);

}

// No return value
void reverse(char* str){
	char temp;
	char *end = str;

	if(str){
		while(*end){
			++end;
		}
		--end;

		while(str < end){
			temp = *str;
			*str++ = *end;
			*end-- = temp;
		}
	}
}

main(){
	char p[] = "hello world!";
	reverse2(p);

	printf("p=%s\n", p);
}