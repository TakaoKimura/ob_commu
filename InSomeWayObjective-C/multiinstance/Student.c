#include "Student.h"
#include <stdio.h>
#include <stdlib.h>


typedef struct StudentStruct {
	int id;
	char * name;
	int isSadist;
}  StudentStruct;

Student Student_create(int id, char * name, int isSadist){
	Student instance = calloc(1, sizeof(StudentStruct));
	instance->id = id;
	instance->name = name;
	instance->isSadist = isSadist;
	return instance;
}

void Student_destroy(Student self){
	free(self);
}

int Student_isNumbered(Student self, int id) {
	return self->id == id;
}

void Student_sayName(Student self) {
	printf("I am %s\n", self->name);
}

void Student_comingOut(Student self) {
	if (self->isSadist) {
		printf("do S desu!\n");
	} else {
		printf("do M desu!\n");
	}
}



