public  class uplowrand {
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            char c = (Math.random() < 0.5) ? (char) ('a' + (int)(Math.random()*26)) : (char) ('A' + (int)(Math.random()*26));
            System.out.print( c+" " );
        }
    }
    
}
