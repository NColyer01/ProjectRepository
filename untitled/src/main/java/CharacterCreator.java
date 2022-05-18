package main.java;

public class CharacterCreator {
    public static void main(String[] args) {
        Character character = Character.createRandomCharacter();
        int age = character.getPhysicalAttribute().getAge();
        System.out.println("Race: " + character.getPhysicalAttribute().getRace());
        System.out.println("Age: " + age);
        System.out.println("Height: " + character.getPhysicalAttribute().getHeight());
        System.out.println("Weight: " + character.getPhysicalAttribute().getWeight());
        System.out.println("Eye Color: " + character.getPhysicalAttribute().getEyeColor());
        System.out.println("Character Gender: " + character.getPhysicalAttribute().getGender());
        System.out.println("Skin Tone: " + character.getPhysicalAttribute().getSkin());
    }
}
