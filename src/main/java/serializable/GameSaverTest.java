package serializable;

import javax.imageio.IIOException;
import java.io.*;


public class GameSaverTest {
    public static void main(String[] args) throws IOException {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"лук, ","меч, " ,"кастет"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"голие руки, ", "большой топор"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[] {"заклинания, ", "невидимость"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IIOException ex) {
            ex.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("Type of first " + oneRestore.getType());
            System.out.println("Type of second " + twoRestore.getType());
            System.out.println("Type of third " + threeRestore.getType());
            System.out.println("List of weapons of 1st type is " + oneRestore);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
