package ru.zinin;

import java.util.Optional;

public class Main {

    public Optional<Person> getPerson() {
        Person person = new Person("aaaa", 25);
        return Optional.ofNullable(person);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getPerson().filter((c)->c.getAge()>30).get().getName());
    }
}
