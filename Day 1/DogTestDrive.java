class Dog {
    int size;
    String breed;
    String name;
    
    void bark()
    {
        System.out.println("Ruff! ruff! " + name + " | breed: " + breed + " size: " + size);
    }
}

class DogTestDrive {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.size = 40;
        d.breed = "Pom";
        d.name = "Imli";
        d.bark();
    }
}