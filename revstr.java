public class revstr {
    public static void main(String[] args) {
        String str = "java is programming";
        String[] words = str.split(" ");
        for(String word : words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }
        }
        System.out.println("");
    }
    
}
