package Workshop3;
class Address {
	   
    private String street;
    private String city;
    private String zipCode;

    
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

   
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

public class Question11 {
	public static void main(String[] args) {
	      
        Address addr = new Address();

       
        addr.setStreet("Himalaya Road");
        addr.setCity("Biratnagar");
        addr.setZipCode("56613");

       
        System.out.println("Street: " + addr.getStreet());
        System.out.println("City: " + addr.getCity());
        System.out.println("Zip Code: " + addr.getZipCode());
    }

}
