package uk.ac.iit.product.api;

public class Address {
    private String city;
    private Long postcode;
    private String county;

    public  Address (){};

    public Address(String city,Long postcode, String county){
        this.city= city;
        this.postcode=postcode;
    }

    public String getCity() {
        return city;
    }

    public Long getPostcode() {
        return postcode;
    }

    public String getCounty() {
        return county;
    }
}
