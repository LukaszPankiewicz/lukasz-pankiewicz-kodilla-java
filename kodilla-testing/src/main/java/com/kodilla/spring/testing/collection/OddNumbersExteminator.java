package com.kodilla.spring.testing.collection;

import java.util.ArrayList;
import java.util.List;

//W utworzonym pakiecie stwórz klasę OddNumbersExterminator, posiadającą metodę public List<Integer>
// exterminate(List<Integer> numbers)
//przyjmującą jako argument kolekcję List liczb typu Integer,
//która zwraca również kolekcję List liczb typu Integer, stanowiącą podzbiór kolekcji wejściowej
// z pominięciem liczb nieparzystych.
//W katalogu src/test/java utwórz pakiet com.kodilla.testing.collection.
//W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite,
// a w niej napisz testy sprawdzające, czy metoda filtrująca liczby nieparzyste działa poprawnie:
//testOddNumbersExterminatorEmptyList – sprawdzający, czy klasa zachowuje się poprawnie,
// gdy lista jest pusta,
//testOddNumbersExterminatorNormalList – sprawdzający, czy klasa zachowuje się poprawnie,
// gdy lista zawiera liczby parzyste i nieparzyste.
//Korzystając z adnotacji @DisplayName nadaj powyższym metodom nazwę określającą, co dany
// test sprawdza.
//Użyj również adnotacji @BeforeEach oraz @Af

public class OddNumbersExteminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> even = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
        return even;
    }
}
