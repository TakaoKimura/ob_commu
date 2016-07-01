#ifndef COURSE_H_
#define COURSE_H_

typedef struct CourseStruct * Course;

char* Course_getName(Course self);
void Course_run(Course self);
int Course_isEnd(Course self);
void Course_destroy(Course self);

#endif


