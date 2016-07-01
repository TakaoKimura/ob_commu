#ifndef COURSEPRIVATE_H_
#define COURSEPRIVATE_H_

#include "Course.h"

typedef struct CourseInterfaceStruct{
	void (*run)(Course);
	int (*isEnd)(Course);
	void (*destroy)(Course);
} CourseInterface;

#endif

