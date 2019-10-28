package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    Pet[] petList = new Pet[1];
    String name;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.petList = pets;
        this.name = name;
        if (pets != null) {
            for (Pet pet : pets) {
                pet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
       ArrayList<Pet> petList2 = new ArrayList();
       petList2.add(pet);
       petList = petList2.toArray(new Pet[petList2.size()]);
    }

    /**
     /* @param pet pet to be removed from the composite collection Pets
     */

    public Integer newSize() {
        Integer newSize;
        if (petList != null && petList.length > 1) {
            newSize = petList.length - 1;
        } else {
            newSize = 1;
        } return newSize;
    }


    public void removePet(Pet pet) {
        Pet[] newArray = new Pet[newSize()];
        Integer index = 0;
        for (int i = 0; i < newSize(); i++) {
            if (!petList[i].equals(pet)) {
                newArray[index] = petList[i];
                index += 1;
            }
        }

        petList = newArray;
    }



    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean isOwner = false;
        for (Pet existingPet : this.petList) {
            if (existingPet.equals(pet)) {
                isOwner = true;
            }
        }
        return isOwner;
    }


    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */

    public Integer[] getAllPetAges() {
        Integer[] ages = new Integer[petList.length];
        for (int i = 0; i < petList.length; i++) {
            Pet currentPet = petList[i];
            ages[i] = currentPet.getAge();

        } return ages;
    }

    public Integer getYoungetPetAge() {
        Integer youngestAge = 0;
        Integer[] allAges = getAllPetAges();
        for (int i = 0; i < petList.length-1; i++) {
            if (allAges[i] < allAges[i+1]) {
                youngestAge = allAges[i];
            } else {
                youngestAge = allAges[i-1];
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = 0;
        Integer[] allAges = getAllPetAges();
        for (int i = 1; i < petList.length; i++) {
            if (allAges[i] > allAges[i-1]) {
                oldestAge = allAges[i];
            } else {
                oldestAge = allAges[i-1];
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer[] allAges = getAllPetAges();
        Integer count = 0;
        Integer sum = 0;
        for (Integer age : allAges) {
            count++;
            sum = sum + age;
        } return (float)sum/count;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.petList.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.petList;
    }
}