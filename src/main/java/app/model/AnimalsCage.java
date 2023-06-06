package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;

import java.sql.ResultSet;

@Component
public class AnimalsCage {

   // @Autowired
    private Animal animal;
    private Timer time;

    @Autowired
    public  void AnimalsCage(@Qualifier("dog") Animal animal, Timer time) {
        this.animal = animal;
        this.time = time;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return time;
    }
}
