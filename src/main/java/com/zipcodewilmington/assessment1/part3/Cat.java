package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    Integer age = 0;
    String name = "";
    PetOwner petOwner;
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age = age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        String spoken = "Meow";
        return spoken;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setPetOwner(PetOwner petOwner) {
        this.petOwner = petOwner;
    }
}
