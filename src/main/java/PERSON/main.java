package PERSON;

public class main {
    public static void main(String[] args) {

        TreeSet<Person> personSetByName = new TreeSet<>(new NameComparator());

        Person Denisa = new Person("Denisa", 29);
        personSetByName.add(Denisa);
        Person Mihai = new Person("Mihai", 30);
        personSetByName.add(Mihai);
        Person Alina = new Person("Alina", 20);
        personSetByName.add(Alina);

        TreeSet<Person> personSetByAge = new TreeSet<>(new AgeComparator());

        personSetByAge.add(Denisa);
        personSetByAge.add(Mihai);
        personSetByAge.add(Alina);


        System.out.println("Sorted by name:");
        for (Person person : personSetByName) {
            System.out.println(person);
        }

        List<Address> fitnessAddresses = Arrays.asList(new Address("Bucuresti,Romania"),
                                                       new Address("Brasov,Romania"));

        List<Address> HikingAddresses = Arrays.asList(new Address("Balan,Romania"));

        Map<Person, List<Hobby>> hobbyMap = new HashMap<>();

        hobbyMap.put(Denisa, Arrays.asList(new Hobby("Fitness", 3, fitnessAddresses),
                new Hobby("Hiking", 2, HikingAddresses)));
        hobbyMap.put(Mihai, Arrays.asList(new Hobby("Hiking", 1, HikingAddresses)));
        hobbyMap.put(Alina, Arrays.asList(new Hobby("Fitness", 2,fitnessAddresses)));

        System.out.println("\nHobby and adrese:");


            List<Hobby> hobbies = hobbyMap.get(person);

            System.out.println("- " + hobby.getName() + ": " + hobby.getFrequency() + " times per week");
            System.out.println("  Addresses:");

        System.out.println("  - "+ address.getCity() + ", " + address.getCountry());





