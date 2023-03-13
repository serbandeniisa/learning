package PERSON;

public class hobby {
    private String name;
    private int frequency;
    private List<Address> addresses;

    private String name;
    private int frequency;
    private List<Address> addresses;

    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
