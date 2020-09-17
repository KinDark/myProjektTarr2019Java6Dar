package impl;

import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Primary
@Repository
@Service
@Qualifier("innaPizza")
@PropertySource ("pizza.properties" )

public class InnaPizza implements IPizza {
    @Value( "Hawajska z pola" )
    private String name;
    @Value ("40")
    private double price;

    public InnaPizza() {
        setName("Hawajska");
        setPrice(15.5);
    }
@Value("${inna name}")
    public String getName() {
        return name;
    }
@Value ( "${inna price}")
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
