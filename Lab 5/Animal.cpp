#include <iostream>
#include <string>
#include "Animal.h"

using namespace std;

//----------Animal----------
Animal::Animal(): _name("unknown") {
	cout << "Constructing object: "<< _name << endl ;
}
		
Animal::Animal(string n, COLOR c): _name(n), _color(c) {
	cout << "Constructing object: "<< _name << " " << _color << endl ;
}
		
Animal::~Animal() {
	cout << "Destructing Animal object "<< _name << endl ;
}
		
void Animal::speak() const {
	cout << "Animal speaks "<< endl ;
}		
//Animal::virtual void move() const = 0;

//----------Mammal----------
Mammal::Mammal(): Animal() {}
		
Mammal::Mammal(string n, COLOR c): Animal(n, c) {}
		
Mammal::~Mammal() {
	cout << "Destructing Mammal object "<< _name << endl;
}
		
void Mammal::move() const {
	cout << "Mammal moves "<< endl ;
}
		
void Mammal::eat() const {
	cout << "Mammal eats " << endl;
}