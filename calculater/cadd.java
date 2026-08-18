public class cadd {
    public static void main(String[] args){
        String ip="x10z22q";
        String num = ip.replaceAll("[^0-9]", ""); 
        String text = ip.replaceAll("[0-9]", ""); 
       //  int numberPart = Integer.parseInt(num);
        System.out.println("Text part: " + text);    
        System.out.println("Integer part: " + num); 
    }
}
