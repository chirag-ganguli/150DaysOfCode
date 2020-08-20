class Dogs {
    String name;
    public static void main(String[] args)
    {
        Dogs dog1 = new Dogs();
        dog1.bark();
        dog1.name = "Bart";

        Dogs[] myDogs = new Dogs[3];  // Dog Array
        // Putting some dogs in the array
        myDogs[0] = new Dogs();
        myDogs[1] = new Dogs();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x < myDogs.length)
        {
            myDogs[x].bark();
            x += 1;
        }
    }
    
    public void bark()
    {
        System.out.println(name + " says Ruff ..");
    }
}