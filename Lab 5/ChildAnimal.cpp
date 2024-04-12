#include <iostream>
#include <string>
#include "ChildAnimal.h"

using namespace std;

//----------Dog----------
Dog::Dog(): Mammal() {}

Dog::Dog(string n, COLOR c): Mammal(n, c) {}

Dog::Dog(string n, COLOR c, string o): Mammal(n, c), _owner(o) {
	cout << "With owner: " << o << endl;
}
	
Dog::~Dog() {
	cout << "Destructing Dog object "<< _name << endl;
}
		
void Dog::speak() const {
	cout << "Woof "<< endl;
}
		
void Dog::move() const {
	cout << "Dog moves "<< endl;
}
		
void Dog::eat() const {
	cout << "Dog eats " << endl;
}

//----------Cat----------
Cat::Cat(): Mammal() {}

Cat::Cat(string n, COLOR c): Mammal(n, c) {}

Cat::Cat(string n, COLOR c, string o): Mammal(n, c), _owner(o) {
	cout << "With owner: " << o << endl;
}

Cat::~Cat() {
	cout << "Destructing Cat object "<< _name << endl;
}
		
void Cat::speak() const {
	cout << "Meow "<< endl;
}
		
void Cat::move() const {
	cout << "Cat moves "<< endl;
}
		
void Cat::eat() const {
	cout << "Cat eats " << endl;
}

//----------Lion----------
Lion::Lion(): Mammal() {}

Lion::Lion(string n, COLOR c): Mammal(n, c) {}

Lion::Lion(string n, COLOR c, string o): Mammal(n, c), _owner(o) {
	cout << "With owner: " << o << endl;
}

Lion::~Lion() {
	cout << "Destructing Lion object "<< _name << endl;
}
		
void Lion::speak() const {
	cout << "Roar "<< endl;
}
		
void Lion::move() const {
	cout << "Lion moves "<< endl;
}
		
void Lion::eat() const {
	cout << "Lion eats " << endl;
}