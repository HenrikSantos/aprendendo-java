package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private final Date manufactureDate;

    public UsedProduct(String name, Double price, String manufactureDate) throws ParseException {
        super(name, price);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.manufactureDate = sdf.parse(manufactureDate);
    }

    @Override
    public String priceTag() {
        return String.format("%s - $ %.2f (Manufacture Date: $ %s", super.getName(), super.getPrice(), manufactureDate);
    }

}
