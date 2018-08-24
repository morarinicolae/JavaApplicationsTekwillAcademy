
package numereperfecte;
public class NumerePerfecte {
    public static void main(String[] args) {
        int LIM=1000;
        int sdiv;
        for (int i=1;i<LIM;i++){
            sdiv=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    sdiv+=j;}
                }
                if(i==sdiv)
                    System.out.println(i);
            }
        }
    }
    

