#include "IdGenerator.h"

static void count();
static int canGenerate();

enum{
	initial_count = 0,max_count = 4, generation_error = -1
};

static int countGeneration = initial_count;

int IdGenerator_generate() {

	if(!canGenerate()){
		return generation_error;
	}
	count();
	return countGeneration;
}

static void count(){
	countGeneration++;
}

static int canGenerate(){
	return countGeneration <= max_count;
}

void IdGenerator_reset(){
	countGeneration = initial_count;
}

