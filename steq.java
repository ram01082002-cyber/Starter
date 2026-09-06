public class steq {
    String model;
    int prize;
    public String toString()
    {
        return model +":"+ prize;
    }
    public boolean equals(steq that)
    {
        return this.model.equals(that.model) && this.prize==that.prize;    //objec class equals
    }
    public static void main(String[] args) {
        steq on = new steq();
        on.model="HP";
        on.prize=34000;

        steq on1 = new steq();
        on1.model="HP";
        on1.prize=34000;
       boolean r = on.equals(on1);
       System.out.println(r);
    }   
}