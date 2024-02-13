import java.util.*;

public class HeapDriver {

  public static void menu() {
    System.out.println("\n\n0: Exit the Program\n1: Create heap\n2: Insert\n3: Delete Root\n4: Print\n5: Heap Sort");
  }
  public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       System.out.print ("To start,enter size of table: ");
       int size = Integer.parseInt (sc.nextLine()) ;
       Heap heap = new Heap (size);

       int option = 0;

       while(true) {
          menu();
          System.out.print("\nEnter an option: ");
          option = Integer.parseInt(sc.nextLine());
        if (option == 0){
            break;
        }
        else if(option == 1){
        System.out.println("Size of the array: ");
        size = Integer.parseInt(sc.nextLine());
        heap = new Heap(size);
        }
       else if (option == 2) {
       System.out.println("Enter key(String) : ");
       String key = sc.nextLine();
       System.out.println("Enter val(int): ");
       int val = Integer.parseInt (sc.nextLine());
       heap.insert(key, val);
       }
       else if (option == 3){
        heap.deleteRoot();
       }
       else if(option == 4){
        heap.print();
       }
       else if(option == 5){
        heap.heapSort();
       }
       else if(option == 6){
        // gotta create items for heapify
        HeapItem[] arr =  new HeapItem[3];
        HeapItem h1 = new HeapItem("t1", 1);
        HeapItem h2 = new HeapItem("t2", 2);
        HeapItem h3 = new HeapItem("t3", 3);
        arr[0] = h1;
        arr[1] = h2;
        arr[2] = h3;
        heap.heapify(arr);
       }
      }
    }
  }
      
       
       
  
  
  
  
  
  
  
  
  
