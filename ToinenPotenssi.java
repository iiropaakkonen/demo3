public class ToinenPotenssi{
  
  /**
   *  Ohjelma korottaa parametrina saadun luvun toiseen potenssiin ja tulostaa sen
   */
  public static void main(String[] args){
   int luku = Integer.parseInt(args[0]);
   double tulos = Math.pow(luku,2);
   System.out.println(tulos);
  }
  
}
