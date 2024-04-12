#ifndef ANIMAL
#define ANIMAL

#include <iostream>
#include <string>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown };

class Animal {
	protected :
		string _name;
		COLOR _color;
		
	public :
		Animal();
		
		Animal(string n, COLOR c);
		
		~Animal();
		
		virtual void speak() const;
		
		virtual void move() const = 0;
};

class Mammal: public Animal {
	public:
		Mammal();
		Mammal(string n, COLOR c);
		
		~Mammal();
		
		void move() const;
		
		virtual void eat() const;
};

#endif