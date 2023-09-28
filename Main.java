public class Main {
    public static void main(String[] args) {
        Bouteille Bt = new Bouteille();
        Bouteille Bt2 =  new Bouteille();

 Bt.specifyShape("Cylindre"); 
 Bt.specifyType("Bouteille d'eau");
 Bt.specifySize("10cm");


Bt2.specifyShape("Hexagon"); 
Bt2.specifyType("Bouteille jus");
Bt2.specifySize("12cm");

System.out.println("Bt");
System.out.println("shape:" + Bt.shape);
System.out.println("type:" + Bt.type);
System.out.println("size:" + Bt.size);

System.out.println("Bt2");
System.out.println("shape:" + Bt2.shape);
System.out.println("type:" + Bt2.type);
System.out.println("size:" + Bt2.size);
}
}
