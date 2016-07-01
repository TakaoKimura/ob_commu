#include "Runner.h"
#include <stdio.h>

static Course* field;
static int fieldSize;

void Runner_setUp(Course courses[], int size) {
	field = courses;
	fieldSize = size;
}

void Runner_run() {
	int i;

	for (i = 0; i < fieldSize; i++) {
		while (!Course_isEnd(field[i])) {
			Course_run(field[i]);
		}
		Course_destroy(field[i]);
	}
}

void Runner_courseInfomation(){
	int i;

	for(i = 0; i < fieldSize; i++){
		printf("コース%d　%s\n", i+1 , Course_getName(field[i]));
	}
}


