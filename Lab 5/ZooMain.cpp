#include <iostream>
#include <string>
#include "ChildAnimal.h"

using namespace std;

int main() {
	int choice;
	Mammal* mammals[3];
	mammals[0] = new Dog("Dog", White);
	mammals[1] = new Cat("Cat", Black);
	mammals[2] = new Lion("Lion", Brown);
	
	do {
		cout << "Select the animal to send to Zoo: " << endl;
		cout << "(1) Dog" << endl;
		cout << "(2) Cat" << endl;
		cout << "(3) Lion" << endl;
		cout << "(4) Move all animals" << endl;
		cout << "(5) Quit" << endl;
		
		cin >> choice;
		switch (choice) {
			case 1:
				mammals[0]->move();
				mammals[0]->speak();
				mammals[0]->eat();
				cout << endl;
				break;
			case 2:
				mammals[1]->move();
				mammals[1]->speak();
				mammals[1]->eat();
				cout << endl;
				break;
			case 3:
				mammals[2]->move();
				mammals[2]->speak();
				mammals[2]->eat();
				cout << endl;
				break;
			case 4:
				for (int i = 0;i < 3; i++) {
					mammals[i]->move();
					mammals[i]->speak();
					mammals[i]->eat();
					cout << endl;
				}
				break;
			case 5:
				cout << "Program exiting..." << endl;
			default:
				cout << "Invalid choice!!! Please try again!!!" << endl;
		}
			
	} while (choice != 5);
	
	for (int i = 0; i < 3; i++) {
		delete mammals[i];
	}
	return 0;
}