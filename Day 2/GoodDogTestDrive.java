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