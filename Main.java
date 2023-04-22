import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;
import java.util.Scanner;

class Main {

  public static void twoLists(ArrayList<String> sl, ArrayList<String> oldsl){
    ListIterator<String> lt = sl.listIterator();
    ListIterator<String> lt2 = oldsl.listIterator();

    while(lt.hasNext()) {
      String next = lt.next();
      
      while(lt2.hasNext()){  
        String next2 = lt2.next();
        if( !next2.equals(next)) {
          lt.add(next2);
        }
      }
      
    }
    lt = sl.listIterator();
    while(lt.hasNext()) {	
      System.out.println(lt.next());
    }
    
  }

  public static void addWithoutSorting(ArrayList<String> sl, String br){
    ListIterator<String> lt = sl.listIterator();
     
    while(lt.hasNext()) {
      String next = lt.next();
      
      if(next.compareTo(br) > 0) {
        lt.previous();
        lt.add(br);
        break;
      }
    }
    if(!lt.hasNext()){
      lt.add(br);
    }

   
    lt = sl.listIterator();
    while(lt.hasNext()) {	
      System.out.println(lt.next());
    }
    
  }

  public static void  charOccurrence(ArrayList<String> sl, String ch){
    ListIterator<String> lt = sl.listIterator();
    ArrayList<String> newList = new ArrayList<String>();

    while(lt.hasNext()){
      String next = lt.next();
      if(next.contains(ch)){
        newList.add(next);
      }
    }
    ListIterator<String> lt2 = newList.listIterator();
    while(lt2.hasNext()){
      String i = lt2.next();
      System.out.println(i);
    }
  }

  public static boolean exists(ArrayList<String> sl, String item){
    ListIterator<String> lt = sl.listIterator();
    boolean equal = false;
    while(lt.hasNext()){
      String next = lt.next();
      if(next.equals(item)){
        equal = true;
      }
    }
    return equal;
  }
  public static void main(String[] args) {
    
    ArrayList<String> shoppingList = new ArrayList<String>();

    // 1
    shoppingList.add("αυγά");
    shoppingList.add("γάλα");
    shoppingList.add("φασόλια");
    shoppingList.add("ζάχαρη");
    shoppingList.add("σοκολάτα");
    shoppingList.add("αλεύρι");

    // 2
    System.out.println("------------------ (2)");
    Iterator<String> it = shoppingList.iterator();

    while(it.hasNext()) {
      String i = it.next();
      System.out.println(i);
    }

    // 3
    System.out.println("------------------ (3)");
    it.remove();
    
    it = shoppingList.iterator();

    while(it.hasNext()) {
      String i = it.next();
      System.out.println(i);
    }

    // 4
    System.out.println("------------------ (4)");
    shoppingList.add("καφές");
    it = shoppingList.iterator();

    while(it.hasNext()) {
      String i = it.next();
      System.out.println(i);
    }

    //5
    System.out.println("------------------ (5)");
    ListIterator<String> lt = shoppingList.listIterator();

    while(lt.hasNext()) {
      String next = lt.next();
      if( "ζάχαρη".equals(next)) {
        lt.set("μέλι");
      }
    }
    
    lt = shoppingList.listIterator();
    while(lt.hasNext()) {	
      System.out.println(lt.next());
    }

    //6
    System.out.println("------------------ (6)");
    lt = shoppingList.listIterator();
    while(lt.hasNext()) {
      String next = lt.next();
      if( "γάλα".equals(next)) {
        lt.remove();
      }
    }
    lt = shoppingList.listIterator();
    while(lt.hasNext()) {	
      System.out.println(lt.next());
    }

    //7
    System.out.println("------------------ (7)");
    lt = shoppingList.listIterator();
    while(lt.hasNext()) {
      String next = lt.next();
      if( "φασόλια".equals(next)) {
        lt.remove();
      }
    }
    lt = shoppingList.listIterator();
    while(lt.hasNext()) {	
      System.out.println(lt.next());
    }
    //8
    System.out.println("------------------ (8)");
    lt = shoppingList.listIterator();
    while(lt.hasNext()) {
      String next = lt.next();
      if( "μέλι".equals(next)) {
        lt.previous();
        lt.add("μπρόκολα");
        break;
      }
    }
    lt = shoppingList.listIterator();
    while(lt.hasNext()) {	
      System.out.println(lt.next());
    }

    //9
    System.out.println("------------------ (9)");
    Collections.sort(shoppingList, Collections.reverseOrder());   
    // Print the sorted ArrayList   
    System.out.println("Ταξινόμηση κατά φθίνουσα σειρά: "+ shoppingList);   

    //10
    System.out.println("------------------ (10)");
    ArrayList<String> oldSL = new ArrayList<String>();

    oldSL.add("αυγά");
    oldSL.add("μήλα");
    oldSL.add("φασόλια");
    oldSL.add("μπανάνες");
    oldSL.add("σοκολάτα");
    oldSL.add("αλάτι");
    oldSL.add("πιπέρι");
    oldSL.add("ζάχαρη");
    oldSL.add("σοκολάτα");
    oldSL.add("αλεύρι");

    Iterator<String> it2 = oldSL.iterator();

    while(it2.hasNext()) {
      String i = it2.next();
      System.out.println(i);
    }

    //11
    System.out.println("------------------ (11)");
    twoLists(shoppingList, oldSL);

    //12
    System.out.println("------------------ (12)");
    Collections.sort(shoppingList);   
    // Print the sorted ArrayList   
    System.out.println("Ταξινόμηση κατά αύξουσα σειρά: "+ shoppingList);

    //13
    System.out.println("------------------ (13α)");
    System.out.println('B' > 'A');

    addWithoutSorting(shoppingList, "ψωμί");

    System.out.println("------------------ (13β)");
    addWithoutSorting(shoppingList, "μαρούλι");

    //14
    System.out.println("------------------ (14)");
    String vowels = "αάεέηήιίοόυύωώ";
    lt = shoppingList.listIterator();

    while (lt.hasNext()) {
      String str = lt.next();

      if (str.equals("μέλι")) {
       break;
      }

      if (vowels.indexOf(str.charAt(0)) == -1) {
        int position = lt.previousIndex();
        System.out.println("Το στοιχείο '" + str + "' στη θέση " + position + " προηγείται από το στοιχείο 'μέλι' και δεν ξεκινάει με φωνήεν.");
            }
        }
    
      //15
      System.out.println("------------------ (15)");
      charOccurrence(shoppingList, "α");

      //16
      System.out.println("------------------ (16)");
      Scanner input = new Scanner(System.in);
      int counter = 0;
      lt = shoppingList.listIterator();
     do{
        System.out.println("Παρακαλώ εισάγετε ένα καινούργιο στοιχείο για την λίστα ");
        String newItem = input.nextLine();
        do{
          if(newItem.length() < 3){
            System.out.println("αυτό το στοιχείο δεν μπορεί να μπει σε λίστα για ψώνια, παρακαλώ δοκιμάστε ξανά");
            break;
          }
          else {
            if(!exists(shoppingList, newItem)){
              shoppingList.add(newItem.toLowerCase());
              counter++;
              System.out.println("μπήκε στη λίστα");
            }
            else {
              System.out.println("υπάρχει ήδη στη λίστα, παρακαλώ διαλέξτε κάτι άλλο");
            }
          }
        }while(newItem.length() < 3);
       
      }while(counter < 5);

    System.out.println("η νέα λίστα είναι: ");

    lt = shoppingList.listIterator();
    while (lt.hasNext()){
      String i = lt.next();
      System.out.println(i);
    }

    //17
    System.out.println("------------------ (17)");
    
    System.out.println("Παρακαλώ εισάγετε ένα καινούργιο στοιχείο για την λίστα ");
    String newItem = input.nextLine();
    if(exists(shoppingList, newItem)){
              
      System.out.println("Ναι, υπάρχει ήδη στη λίστα");
    }
    else {
      String newItem2 = "";
      do{
        System.out.println("Όχι, δεν υπάρχει στη λίστα. Πληκτρολογήστε Ν για να προστεθεί στη λίστα ή Ο για να το αγνοήσουμε");
      newItem2 = input.nextLine();
        if(newItem2.equals("Ν")){
          shoppingList.add(newItem);
          System.out.println("Το νέο στοιχείο " + newItem + " προστέθηκε στη λίστα.");
        break;
        }
        else if(newItem2.equals("Ο")){
          System.out.println("Το νέο στοιχείο " + newItem + " δεν προστέθηκε στη λίστα.");
            break;
        }
        else {
          System.out.println("Αυτή η απάντηση δεν είναι αποδεκτή παρακαλώ δοκιμάστε ξανα");
        }
      }while(!newItem2.equals("Ν") && !newItem2.equals("Ο"));
      
    }
    System.out.println("Η νέα λίστα είναι: ");
    lt = shoppingList.listIterator();
    while(lt.hasNext()){
      String next = lt.next();
      System.out.println(next);
    }
    //18
    System.out.println("----------------(18)");
    System.out.println("Παρακαλώ εισάγετε ένα στοιχείο για να διαγραφεί αν υπάρχει στη λίστα");
    newItem = input.nextLine().toLowerCase();
    if(exists(shoppingList, newItem)){
      shoppingList.remove(newItem);       
      System.out.println("Το " + newItem + " διαγράφηκε από τη λίστα.");
    }
    else{
      System.out.println("To " + newItem + " δεν υπάρχει στη λίστα.");
    }
     System.out.println("Η νέα λίστα είναι: ");
    lt = shoppingList.listIterator();
    while(lt.hasNext()){
      String next = lt.next();
      System.out.println(next);
    }

    //19
    System.out.println("----------------(19)");
    newItem="";
    do{
      System.out.println("Παρακαλώ πληκτρολογήστε 'Α' για να ταξινομηθεί η λίστα κατά αύξουσα σειρά ή 'Φ' για να ταξινομηθεί κατά φθίνουσα. ");
    newItem = input.nextLine().toLowerCase();
    if (newItem.equals("α")){
      Collections.sort(shoppingList);  
      break;
    }
    else if (newItem.equals("φ")){
      Collections.sort(shoppingList, Collections.reverseOrder());  
      break;
    }
    else {
      System.out.println("Αυτή η επιλογή δεν υπάρχει.");
    }
    }while(!newItem.equals("α") && !newItem.equals("φ"));
    
    System.out.println("Η νέα λίστα είναι: ");
    lt = shoppingList.listIterator();
    while(lt.hasNext()){
      String next = lt.next();
      System.out.println(next);
    }

    //20
    System.out.println("----------------(20)");
    
    do{
      
      System.out.println("Παρακαλώ πληκτρολογήστε ένα στοιχείο ώστε να το διαγράψουμε από τη λίστα");
      newItem = input.nextLine().toLowerCase();
      if(exists(shoppingList, newItem)){
        shoppingList.remove(newItem);       
        System.out.println("Το " + newItem + " διαγράφηκε από τη λίστα.");
      }
      else{
        System.out.println("To " + newItem + " δεν υπάρχει στη λίστα.");
      }
      System.out.println("Η νέα λίστα είναι: ");
      lt = shoppingList.listIterator();
      while(lt.hasNext()){
        String next = lt.next();
        System.out.println(next);
      }
    }while(shoppingList.size() > 0);
   
  }
}
