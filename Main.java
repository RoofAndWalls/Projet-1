public class Main {
    public static void main(String[] args) {
        Bouteille Bt = new Bouteille();
        Bouteille Bt2 =  new Bouteille();

 Bt.setShape("Cylindre"); 
 Bt.setType("Bouteille d'eau");
 Bt.setSize("10cm");


Bt2.setShape("Hexagon"); 
Bt2.setType("Bouteille jus");
Bt2.setSize("12cm");

System.out.println("Bt");
System.out.println(Bt);


System.out.println("Bt2");
System.out.println(Bt2);

System.out.println(Bt.equals(Bt2));
}
}
