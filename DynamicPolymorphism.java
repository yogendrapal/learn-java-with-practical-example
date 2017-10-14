class base
{
       public void show()
	   {
System.out.println("Show in base...");
	   }
}
class DynamicPolymorphism extends base
{
 public void show()
 {
System.out.println("Show in DynamicPolymorphism");
 }
 public void display(){}
 public static void main(String args[])
 {
	 base b = new base();
	 b.show();
	 DynamicPolymorphism dp = new DynamicPolymorphism();
	 dp.show();
	 b = new DynamicPolymorphism();
	 b.show();
	 //b.display();
 }
} 