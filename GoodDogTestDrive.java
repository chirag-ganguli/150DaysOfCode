class GoodDog
{
    private int size;   // Make the instance variable private

    public int getSize()    // Make the getter method public
    {
        return size;
    }

    public void setSize (int s)     // Make the setter method public
    {
        size = s;
    }

    void bark()
    {
        if(size > 60)
        {
            System.out.println("Woof! Woof!");
        }
        else if(size > 14)
        {
            System.out.println("Ruff! Ruff!");
        }
        else 
        {
            System.out.println("Yip! Yip!");
        }
    }
}

class GoodDogTestDrive
{
    public static void main(String[] args)
    {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two  = new GoodDog();
        two.setSize(8);
        System.out.println("Dog One: " + one.getSize());
        System.out.println("Dog Two: " + two.getSize());
        one.bark();
        two.bark(); 
    }
}



// How objects in an array behave
/*
    1. Declare and create Dog Array to hold 7 Dog references 
        Dog[] pets;
        pets = new Dog[7];

    2. Create 2 new Dog Objects, and assign them to first 2 array elements
        pets[0] = new Dog();
        pets[1] = new Dog();

    3. Call Methods on the two Dog objects
        pets[0].setSize(30);
        int x = pets[0].getSize(); // 30
        pets[1].setSize(8);
*/

/*
    Instance variables always get a default value.
    If we don't explicitly assign a value to an instance variable, or we don't call a setter method, the instance variable has a value.
    Int: 0      Float: 0.0      Bool: false     References: null
*/