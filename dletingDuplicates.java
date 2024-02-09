
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Robin Dupuis
 */
public class ArraylistGeneric extends ArrayList{
    public void addElement(Object a)
    {
        this.add(a);
    }
    
   public ArrayList getArrayList(){
       return this;
   }
   
   public static void removeDuplicate(ArrayList<Integer> list)
   {
       for(int i=0; i<list.size();++i ){
           for(int j = i+1; j<list.size(); ++j){
               if(list.get(i).equals(list.get(j))){
                   list.remove(j);
               }
           }
       }
   }
   
   
    public static void main(String[] args) {
        ArraylistGeneric ar1 = new ArraylistGeneric();
       
        ar1.addElement(100);
        System.out.println(ar1);
        
        ar1.getArrayList().add(300);
        ar1.getArrayList().add(300);
      removeDuplicate(ar1);
        System.out.println(ar1);
       Scanner input = new Scanner(System.in);
       
       ArraylistGeneric ar2 = new ArraylistGeneric();
        System.out.println("enter ten integers :");
        
        for(int i=0; i<10; ++i){
            int num = input.nextInt();
            ar2.getArrayList().add(num);
        }
        
        removeDuplicate(ar2);
        System.out.println(ar2.toString());
    }

}
