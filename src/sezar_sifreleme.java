import java.util.Scanner;

public class sezar_sifreleme {

	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        String sezar;
        System.out.println("C�mle giriniz: ");
        sezar = scan.nextLine();
        
        char[] sezarDizisi = sezar.toCharArray(); //Karakter dizisine d�nd�rd�k. 
        
        System.out.println("�teleme indexi gir: "); 
        int oteleme = scan.nextInt();
        
        for(int i=0; i<sezarDizisi.length; i++){  
        	
        	int asciiSirasi = (int)sezarDizisi[i];           
        	
        	if(asciiSirasi == 32)       //ascii harf aral�g� 
        		sezarDizisi[i] = ' ';           
        	else {        
        		
        		if(asciiSirasi >=65 && asciiSirasi <=90){        
        			
        			if((asciiSirasi+oteleme) >90)
        				
                        sezarDizisi[i] = (char) (((asciiSirasi+oteleme)%90) + 64);
                  
        			else
                   
        				sezarDizisi[i] = (char) (asciiSirasi+3);
           
        		}
                
                if(asciiSirasi >=97 && asciiSirasi <=122){        
                	  
                	if((asciiSirasi+oteleme) >122)
                       
                		sezarDizisi[i] = (char) (((asciiSirasi+oteleme)%122) + 96);
                  
                	else
                    
                		sezarDizisi[i] = (char) (asciiSirasi+3);
            
                }
            }
            
      
        }
       
        String yeniCumle = String.valueOf(sezarDizisi); //stringe cevirmek i�in yapt�k.
        
        
        System.out.println("Girilen C�mle: " + yeniCumle);
       
    }
    
}
