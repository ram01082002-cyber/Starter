package enumous;

import javax.sound.sampled.SourceDataLine;

enum perform
{
    good,bad,poor;
}
public class en2 {
    public static void main(String[] args) {
    perform fo = perform.bad;
    System.out.println(fo.ordinal());
    }    
}