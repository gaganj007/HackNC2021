import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class project {

    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the world of \"The Talking Keys\" Enter \'quit\' to exit");
        String getChar = scanner.next();
        while (!(getChar.toLowerCase().equals("quit")))
        {
            if(getChar.toLowerCase().equals("a"))
            {
                playSound("StarWars3.wav");
                getChar = scanner.next();
            }
            if(getChar.toLowerCase().equals("b"))
            {
                playSound("CantinaBand3.wav");
                getChar = scanner.next();
            }
          
        }




    }

    public static void playSound(String sound) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {
        File file = new File(sound);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength()/1000);
    }
}