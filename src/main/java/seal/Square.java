package seal;

non-sealed

class Square extends Shape {
	//non-sealed - umożliwia odwrócenie tego, co wprowadził modyfikator sealed. Klasa, która może dziedziczyć z klasy sealed, po wprowadzeniu tego modyfikatora, pozwala na dalsze dziedziczenie z siebie bez restrykcji wprowadzonych przez klasę sealed
}
