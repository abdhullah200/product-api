package uk.ac.iit.product.api;

public class PhysicalProduct extends Product{
    /*
    A PhysicalProduct IS-A Product because
    name one other class a shop system might have that would NOT pass this test, and say why.
*/
    private double weightKg;
    private String dimensions;


    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }
}
