public class nprim {
    public static void main(String[] args) {
        int n =10;
        int c = 0;
        for(int num=2; ;num++){
        int f =0;
        for(int j=1;j<=num;j++){
        if(num%j==0){
        f++;}}
        if(f==2) {c++;}
        if(c==n){
        System.out.println(num);break;}
}  
}
}
