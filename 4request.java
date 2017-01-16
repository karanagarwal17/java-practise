class Elevator{
int currentFloor;
void setCurrentFloor(){
currentFloor = 0;
}
void openDoor(){
	System.out.println("Door opened");
}
void waitDoor(){
	System.out.println("Door waiting");
}
void closeDoor(){
	System.out.println("Door closed");
}
void moveUp(int numberOfFloors){
	System.out.println("Lift is moving up.");
	currentFloor = currentFloor + numberOfFloors;
}
void moveDown(int numberOfFloors){
	System.out.println("Lift is moving down.");
	currentFloor = currentFloor - numberOfFloors;
}
void printcurrentloc(){
	System.out.println("The lift is at floor: " + currentFloor);
}
void resetCurrentFloor(int floor){
//……write the logic for resetting the value of currentFloor of the elevator here……
	printcurrentloc();
	if(floor > currentFloor)	
		moveUp(floor-currentFloor);
	else if(floor < currentFloor)
		moveDown(currentFloor - floor);
	printcurrentloc();
	openDoor();
	waitDoor();
	closeDoor();
	moveDown(floor);
	printcurrentloc();
	openDoor();
	waitDoor();
	closeDoor();
}
}

class Request{
static int floor;
public static void main(String args[]){
		floor = 5; // execute it with different values of floor and observe the output
		Elevator e = new Elevator();
		e.currentFloor = 3;
		e.resetCurrentFloor(floor);
}
}

