#include "CoursePrivate.h"

struct CourseStruct{
	CourseInterface vtable;
	char* name;
};

char* Course_getName(Course self){
	return self->name;
}

void Course_run(Course self){
	self->vtable.run(self);
}

int Course_isEnd(Course self){
	return self->vtable.isEnd(self);
}

void Course_destroy(Course self){
	self->vtable.destroy(self);
}

