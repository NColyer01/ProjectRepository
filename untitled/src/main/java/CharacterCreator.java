package main.java;

public class CharacterCreator {
    public static void main(String[] args) {
        Character character = Character.createRandomCharacter();
        int age = character.getPhysicalAttribute().getAge();
        System.out.println(age);

    }
}
