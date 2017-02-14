package addressBook.models;

/**
 * Created by student on 14/02/2017.
 */
public class Address {

    // Fields
    public String firstLineAddress;
    public String secondLineAddress;
    public String city;
    public String postCode;

    // Constructor
    public Address(String firstLineAddress, String secondLineAddress, String city, String postCode) {
        this.firstLineAddress = firstLineAddress;
        this.secondLineAddress = secondLineAddress;
        this.city = city;
        this.postCode = postCode;
    }

    // Getters and setters
    public String getFirstLineAddress() {
        return firstLineAddress;
    }

    public void setFirstLineAddress(String firstLineAddress) {
        this.firstLineAddress = firstLineAddress;
    }

    public String getSecondLineAddress() {
        return secondLineAddress;
    }

    public void setSecondLineAddress(String secondLineAddress) {
        this.secondLineAddress = secondLineAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLineAddress='" + firstLineAddress + '\'' +
                ", secondLineAddress='" + secondLineAddress + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
