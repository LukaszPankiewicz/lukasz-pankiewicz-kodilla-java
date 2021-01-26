package com.kodilla.stream.world;

import java.util.Set;

public final class Continent {
    private final Set<Country> collectionOfCountries;

    public Continent(Set<Country> collectionOfCountries) {
        this.collectionOfCountries = collectionOfCountries;
    }

    public Set<Country> getCollectionOfCountries() {
        return collectionOfCountries;
    }
}
