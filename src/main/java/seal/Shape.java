package seal;

sealed

class Shape permits Circle,Square {
	//permits – pozwala klasom na dziedziczenie wybranych klas, pomimo oznaczenia sealed
	//sealed – oznacza klasę lub interfejs, powoduje taką samą widoczność jak wcześniej, ale ogranicza dziedziczenie klas czy rozszerzanie interfejsów
}
