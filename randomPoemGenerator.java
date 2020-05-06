import java.util.*;
import java.lang.*;
import java.io.*;

public class randomPoemGenerator {
    File file;
    Scanner s;
    private static Random rand = new Random();
    LinkedList <String> poem = new LinkedList<String>();
    String word;
    int rand_int;
    int cast;

    public randomPoemGenerator (String filename){
        file = new File (filename);
        try {
        s = new Scanner (file);}
        catch (FileNotFoundException e){
            System.out.println("Wrong filename boo");
        }
    }
    
    public LinkedList writePoem(){
        //parsing through Paradise Lost to 
        //produce a random 8 line poem
        rand_int = rand.nextInt(50);
        while (s.hasNextLine()){
                String input = s.nextLine();
                input = input.replaceAll("\\s*\\[[^\\[]*\\]", "");
                String [] splitted = input.split(" ");
                 for (int i=0; i < splitted.length; i++){
                   //you no longer need the following to decide if something is a word
//                  if (splitted [i] != "[" && splitted [i]!= "]" && splitted[i]!= " "){
//                      cast = Integer.parseInt(splitted[i]);
//                      if (!(cast >= 48 && cast <= 57))
                       word = splitted [i];
                     //  System.out.print(word);
                   //}
                 if (rand_int % 10 == 6){
                     
                    if (poem.size() < 40)
                    poem.add(word);
                  }
                rand_int = rand.nextInt(50);

           }
            
                
            }
        return poem;
    }
    
}
