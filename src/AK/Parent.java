package AK;

public class Parent {
    { 
        System.out.println("A");
    }

    static { 
        System.out.println("B");
    }

    public class child extends Parent { 
        
    	{
    		System.out.println("C");
    	}
        
    }

    public static void main(String[] args) {
      Parent p = new Parent(); // Create an instance of Parent
      Parent.child c= p.new child();
      //or
      System.out.println("New way");
      p.new child();
      
     
    }
}