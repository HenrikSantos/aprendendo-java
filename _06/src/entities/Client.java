package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public String name;
    private String email;
    private final Date birthDate;

    public Client(String name, String email, String birthDate) throws ParseException {
        this.name = name;
        this.email = email;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.birthDate = sdf.parse(birthDate);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
