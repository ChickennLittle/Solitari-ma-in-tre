import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		String [] Seed = new String[] {"Denara","Spade","Coppe","Bastoni"};
		int [] Value= new int[] {1,2,3,4,5,6,7,8,9,10};
		 ArrayList<Carta>Mazzo= new ArrayList<Carta>();
		 
        for (int i=0; i<Seed.length; i++) {
			for(int j=0; j<Value.length; j++) {
				Mazzo.add(new Carta(Value[j],Seed[i]));}
			}
       Collections.shuffle(Mazzo);
       
          
       double Plays=10000000;
       double Failure=0;
       double Success=0;
       
       for(int k=0;k<=Plays-1;k++) {
    	   
    	   
       int Exit1=0;
       for(int i=0;i<=39;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==1)
    		   Exit1++;
    	   }
       
       int Exit2=0;
       for(int i=1;i<39;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==2)
    		   Exit2++;
    	   }
       
       int Exit3=0;
       for(int i=2;i<39;i=i+3) {
    	   if(Mazzo.get(i).getNumero()==3)
    		   Exit3++;
    	   }
        
       if(Exit1==0 && Exit2==00 && Exit3==0)
    	   Success++;
       else
    	   Failure++;
       Collections.shuffle(Mazzo);
       }
       System.out.println("Numero di Vittorie:"+""+Success);
       System.out.println("Numero di Sconfitte:"+""+Failure);
       System.out.println("La probabilità di vittoria è:");
        double Winrate=1-Failure/Plays;
        System.out.println(Winrate);
     }
	}