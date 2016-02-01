package without_abstract_test_1;

public class PetTest {
    public static void main(String[] args) {
        Pet pet = new Pet("PetName1");
        System.out.println(pet.getName());
        pet.voice();

        Pet pets[] = {
                new Cat("catName1"),
                new Dog("dogName1")
        };
        for (Pet childPet : pets) {
            System.out.println(childPet.getName());
            childPet.voice();
        }
    }
}
