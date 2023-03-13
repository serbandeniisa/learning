package PERSON;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*

public class address {
    private String street;
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }


    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}