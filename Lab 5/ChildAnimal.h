#ifndef CHILDANIMAL
#define CHILDANIMAL

#include <iostream>
#include <string>
#include "Animal.h"

using namespace std;

class Dog: public Mammal {
	private:
		string _owner;
		
	public:
		Dog();
		Dog(string n, COLOR c);
		Dog(string n, COLOR c, string o);
	
		~Dog();
		
		void speak() const;
		
		void move() const;
		
		void eat() const;
}; 

class Cat: public Mammal {
	private:
		string _owner;
		
	public:
		Cat();
		Cat(string n, COLOR c);
		Cat(string n, COLOR c, string o);
	
		~Cat();
		
		void speak() const;
		
		void move() const;
		
		void eat() const;
}; 

class Lion: public Mammal {
	private:
		string _owner;
		
	public:
		Lion();
		Lion(string n, COLOR c);
		Lion(string n, COLOR c, string o);
	
		~Lion();
		
		void speak() const;
		
		void move() const;
		
		void eat() const;	
}; 

#endif