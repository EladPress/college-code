public class Child 
{
    public void drink(Squeezable fruit)
    {
        System.out.println(fruit.getType() + " is squeezed");
    }

    public static void main(String[] args)
    {
        Child child = new Child();
        Fruit orange = new Orange();
        child.drink(orange);
    }
}
