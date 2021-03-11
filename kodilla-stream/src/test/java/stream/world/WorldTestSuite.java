package stream.world;

import com.kodilla.spring.stream.world.Continent;
import com.kodilla.spring.stream.world.Country;
import com.kodilla.spring.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
            //Sets countries -> continents
        Set<Country> asian = new HashSet<>();
        Set<Country> european = new HashSet<>();
        Set<Country> southAmerican = new HashSet<>();
            //Countries
        Country thailand = new Country (new BigDecimal("15000000"));
        Country china = new Country (new BigDecimal("15000000"));
        Country vietnam = new Country (new BigDecimal("15000000"));
        Country laos = new Country (new BigDecimal("15000000"));
        Country poland = new Country (new BigDecimal("15000000"));
        Country germany = new Country (new BigDecimal("15000000"));
        Country slovakia = new Country(new BigDecimal("15000000"));
        Country cuba = new Country(new BigDecimal("15000000"));
        Country ecuador = new Country (new BigDecimal("15000000"));
        Country brazil = new Country (new BigDecimal("15000000"));
        asian.add(thailand);
            //Countries -> Continents
        asian.add(china);
        asian.add(vietnam);
        asian.add(laos);
        european.add(poland);
        european.add(germany);
        european.add(slovakia);
        southAmerican.add(cuba);
        southAmerican.add(ecuador);
        southAmerican.add(brazil);
            //Continents
        Continent asia = new Continent(asian);
        Continent europe = new Continent(european);
        Continent southAmerica = new Continent(southAmerican);
            //Continents -> Continent
        Set<Continent>continentsTogether = new HashSet<>();
        continentsTogether.add(asia);
        continentsTogether.add(europe);
        continentsTogether.add(southAmerica);
            //Continent -> World
        World world = new World(continentsTogether);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("150000000");

        //Then
        Assertions.assertEquals(expected, peopleQuantity);
    }
}
