import java.util.*;
public class teams{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> arr=new ArrayList<>();
    System.out.print("enter no.of teams");
    int t=sc.nextInt();
    int s=0;
    while(s<t){
        arr.add(sc.next());
        s++;
    }
    ArrayList<ArrayList<String> > x = new ArrayList<ArrayList<String> >();
    for(int i=0;i<=9;i++){
      x.add(new ArrayList<String>());
    }
    for(int i=0;i<=3;i++){
      if(i==0){
      x.get(i).add(i,arr.get(i)+"vs"+arr.get(i+1));
      x.get(i+1).add(i,arr.get(i)+"vs"+arr.get(i+2));
      x.get(i+2).add(i,arr.get(i)+"vs"+arr.get(i+3));
      x.get(i+3).add(i,arr.get(i)+"vs"+arr.get(i+4));
      }
      if(i==1){
      x.get(i+3).add(i-i,arr.get(i)+"vs"+arr.get(i+1));
      x.get(i+4).add(i-i,arr.get(i)+"vs"+arr.get(i+2));
      x.get(i+5).add(i-i,arr.get(i)+"vs"+arr.get(i+3));
      }
      if(i==2){
      x.get(i+5).add(i-i,arr.get(i)+"vs"+arr.get(i+1));
      x.get(i+6).add(i-i,arr.get(i)+"vs"+arr.get(i+2));
      }
      if(i==3){
      x.get(i+6).add(i-i,arr.get(i)+"vs"+arr.get(i+1));
      }
    }
   
    
    
      
      
     
  }
      
   
}


