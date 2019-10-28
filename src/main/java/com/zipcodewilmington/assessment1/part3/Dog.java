package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    Integer age = 0;
    String name = "";
    PetOwner petOwner;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = age;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = name;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        String spoken = "Bark";
        return spoken;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public PetOwner getPetOwner() {
        return petOwner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetOwner(PetOwner petOwner) {
        this.petOwner = petOwner;
    }
}
