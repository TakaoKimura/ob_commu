#include "Curve.h"
#include "CoursePrivate.h"
#include <stdlib.h>
#include <stdio.h>

static void run(Course self);
static int isEnd(Course self);
static void destroy(Course self);

typedef struct CurveStruct * Curve;

typedef struct CurveStruct{
	CourseInterface vtable;
	char *name;
	int distance;
} CurveStruct;

static CourseInterface interface = {
	run, isEnd, destroy
};

static char name[] = "Curve";

Course Curve_create(int distance){
	Curve self = calloc(1,sizeof(CurveStruct));
	self->vtable = interface;
	self->name = name;
	self->distance = distance;
	return (Course) self;
}

static void run(Course self){
	Curve curve = (Curve) self;
	curve->distance -= 20;
	printf("カーブ走行中！　走行完了まであと%dメートル\n", curve->distance);
}

static int isEnd(Course self){
	Curve curve = (Curve) self;
	return curve->distance <= 0;
}

static void destroy(Course self){
	free(self);
}


