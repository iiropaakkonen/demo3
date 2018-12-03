public class ToinenPotenssi{
  
  /**
   *  Ohjelma korottaa parametrina saadun luvun toisena parametrina saatuun eksponenttiin ja tulostaa sen
   */
  public static void main(String[] args){
   int luku = Integer.parseInt(args[0]);
   int eksponentti = Integer.parseInt(args[1]);
   double tulos = Math.pow(luku,eksponentti);
   System.out.println(tulos);
  }
  
}
