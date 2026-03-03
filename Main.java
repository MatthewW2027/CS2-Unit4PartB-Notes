import java.util.ArrayList; 

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

      // 4.8 ARRAYLIST 
      /* ArrayList is a RE-SIZABLE collection 
         You can ADD or REMOVE items from lists! 
         ArrayList is MUTABLE (can change during run) 
      */

      // ArrayList<Type> name = new ArrayList<Type>();
      
      ArrayList<String> toDo = new ArrayList<String>(); 
      // For numbers, must WRAPPER classes (not primitives!) 
      ArrayList<Integer> intList = new ArrayList<Integer>(); 
      ArrayList<Double> dubList = new ArrayList<Double>(); 

      // ARRAYLIST METHODS (assume "list" is an ArrayList) 
      // the number of items in the list 
      int numTasks = toDo.size(); 
      System.out.println("Number of items on To Do list: " + numTasks); 

      // list.add(obj) appends the obj to end of list
      // returns a boolean, but that's not important 
      toDo.add("build robot"); 
      toDo.add("do homework"); 
      toDo.add("sleep"); 
      // check size after adding stuff 
      System.out.println(toDo.size()); 
      // check size after adding stuff
      System.out.println("Number of items after adding: " + toDo.size()); 
      System.out.println(toDo); // ArrayList has a nive toString method!!! 

      // list.add(index, obj) inserts the obj 
      // AT a specific INDEX! (position)
      toDo.add(1, "finish school"); 
      System.out.println(toDo); 
      // REMEMBER that indexes start at 0 
      // so 1 means we added to the SECOND spot 

      // list.get(int index) returns the item at that specified index 
      toDo.get(0); 
      String firstItem = toDo.get(0); 
      // return type matches what the ArrayList holds 
      System.out.println("Do this first: " + firstItem); 
      // list.set(int index, obj newItem)
      // replaces item at that index with a new one! 
      String replaceItem = toDo.set(0, "learn to fly"); 
      System.out.println(toDo);
      System.out.println("We replaced: " + replaceItem); 

      // list.remove(int index) deletes the item at that index 
      // shifting everything else back one number 
      // also returns the removed item! (called E on the quick reference)
      String removeItem = toDo.remove(2); 
      System.out.println(toDo); 
      System.out.println("We removed the item: " + removeItem); 

      // 49 ARRAYLIST TRAVERSAL 
      ArrayList<Integer> scores = new ArrayList<Integer>(); 
      scores.add(91);
      scores.add(90); 
      scores.add(87); 
      System.out.println(scores); 
      
      // ENHANCED FOR-EACH LOOP 
      // to "visit" every item in order 
      // does not keep track of current index/position 
      for (Integer currentScore : scores ) {
         System.out.println("Test Score: " + currentScore); 
      }
      // typical example: count up all items 
      double sum = 0; 
      for (Integer score : scores) {
         sum = sum + score; // OR sum += score; 
      }
      double avg = sum / scores.size(); 
      System.out.println("Test Average: " + avg); 

      // STANDARD FOR LOOP: when you need to keep track of the current INDEX (position)
      // like if you want to use a method (set, get, etc.) 
      for (int i = 0; i < scores.size(); i++) {
         // get item at current index 
         int currentItem = scores.get(i); 
         int curvedScore = currentItem + 100; 
         scores.set(i, curvedScore); // replace item 
      }
      System.out.println(scores);

      // WHILE LOOP (iterate until condition is false)
      ArrayList<String> groceries = new ArrayList<String>(); 
      groceries.add("milk"); 
      groceries.add("cream cheese"); 
      groceries.add("bread"); 
      groceries.add("milk"); 
      groceries.add("gold fish"); 
      // guess waht this loop is trying to do? 
      boolean found = false; 
      int index = 0; 
      // !found is the same as found == false 
      while (index < groceries.size() && !found) {
         if ("milk".equals(groceries.get(index))) {
            // if current item in list is "milk" 
            groceries.remove(index); 
            found = true; 
         }
         else {
            index++; // continue through list 
         } 
      }
      System.out.println(groceries); 

   } // END MAIN METHOD 
} // END CLASS 
