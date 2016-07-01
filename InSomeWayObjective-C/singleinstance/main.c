#include "IdGenerator.h"
#include <stdio.h>

int main() {
	int i;

	for (i = 0; i < 6; i++) {
		printf("generate %d\n", IdGenerator_generate());
	}

	IdGenerator_reset();

	for (i = 0; i < 6; i++) {
		printf("generate %d\n", IdGenerator_generate());
	}

	return 0;
}

