
#include "Student.h"
#include <stdio.h>

int main() {
	int i;
	Student students[5];
	students[0] = Student_create(1, "Kitanocci", 1);
	students[1] = Student_create(2, "Yamadashi", 1);
	students[2] = Student_create(3, "DragonMasterJuso", 1);
	students[3] = Student_create(4, "HoshizoraHase", 0);
	students[4] = Student_create(5, "NishikawaBancho", 1);

	for(i=0; i < 5; i++) {
		printf("checking id...\n");
		if(Student_isNumbered(students[i], i+1)) {
			printf("success!\n");
			Student_sayName(students[i]);
			Student_comingOut(students[i]);
			printf("\n");
		} else {
			printf("failed\n");
		}
		Student_destroy(students[i]);
	}
	return 0;
}

