#ifndef STUDENT_H_
#define STUDENT_H_


typedef struct StudentStruct * Student;

Student Student_create(int id, char * name, int isSadist);
void Student_destroy(Student self);
int Student_isNumbered(Student self, int id);
void Student_sayName(Student self);
void Student_comingOut(Student self);

#endif



