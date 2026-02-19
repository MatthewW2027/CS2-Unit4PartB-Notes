public class Main {

   public static void main(String []args) {

      // 4.7 WRAPPER CLASSES wrap primitives into objects 
      // why? some methods NEED objects 
      Integer fancyInt = new Integer(12); 
      Double fancyDoub = new Double(1.2); 
      // calling a constructor is no longer necessary! 
      // can just declare them like would primitaves! 
      Integer fancierInt = 12;
      System.out.println(fancierInt); 
      // AUTOBOXING: Java converts int to Integer 
      // (we passed 13, a primitive value. then Java promoted it to an Integer!) 
      int regularInt = fancierInt; // UNBOXING 

      // Another benefit of Wrappers: you can use some methods 
      System.out.println(Integer.MIN_VALUE); 
      System.out.println(Integer.MAX_VALUE); 
      String stringyNums = "12.0"; 
      Double parsedD = Double.parseDouble(stringyNums); 
      System.out.println(parsedD); 
      String stringyNums2 = "12"; 
      int parsedI = Integer.parseInt(stringyNums2); 
      System.out.println(parsedI); 

   }
}
