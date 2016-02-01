package without_abstract_test_1;

public class Pet {
    private String name;

    public Pet() {
        System.out.println("def cons -> PET");
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Pet voice ->:) ");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}

