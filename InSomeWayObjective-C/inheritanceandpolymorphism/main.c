#include "Course.h"
#include "Runner.h"
#include "Curve.h"
#include "Gate.h"

int main(){
	Course courses[2];

	courses[0] = Curve_create(100);
	courses[1] = Gate_create(3);
	Runner_setUp(courses, 2);
	Runner_courseInfomation();
	Runner_run();

	return 0;
}

