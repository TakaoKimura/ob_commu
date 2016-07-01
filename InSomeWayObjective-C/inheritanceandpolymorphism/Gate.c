#include "CoursePrivate.h"
#include "Gate.h"
#include <stdlib.h>
#include <stdio.h>

static void run(Course self);
static int isEnd(Course self);
static void destroy(Course self);


typedef struct GateStruct * Gate;

typedef struct GateStruct{
	CourseInterface vtable;
	char* name;
	int number;
} GateStruct;


static char name[] = "Gate";

static CourseInterface interface = {
	run, isEnd, destroy
};

Course Gate_create(int number){
	Gate self = calloc(1,sizeof(GateStruct));
	self->vtable = interface;
	self->name = name;
	self->number = number;
	return (Course) self;
}

static void run(Course self){
	Gate gate = (Gate) self;
	gate->number--;
	printf("ゲート走行中！　走行完了まであと%d個くぐる必要があります\n", gate->number);
}

static int isEnd(Course self){
	Gate curve = (Gate) self;
	return curve->number == 0;
}

static void destroy(Course self){
	free(self);
}

