import java.util.*;
import java.lang.*;
import java.io.*;

public class randomPoemTester  {
public static void main (String [] args){
    
    randomPoemGenerator obj = new randomPoemGenerator ("ParadiseLost.txt");
    LinkedList poem = obj.writePoem();
    for (int i=0; i < poem.size(); i++){
        System.out.print(poem.get(i) + " ");
    }
}
}