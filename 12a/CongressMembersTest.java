// CongressMembersTest.java
// Jeffrey Yang
// 1606512
// Sorting Approval Ratings
// This program reads a text file, uses the CongressMembers class to store those values and performs some sorting operations with them

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;



public class CongressMembersTest extends CongressMembers {
    public static void main(String[] argv) throws Exception{ // i don't really know what this does but its from java2s.com. looks like an alternative to the try catch
        int amount = 0;

        try { //idea taken from ReadFile.java on the class site
            File f = new File("approval.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) { //finds number of people in the text file
                sc.nextLine();
                amount++;



            }
            sc.close();

            CongressMembers cmarray[] = new CongressMembers[amount];
            for(int i = 0; i < amount; i++){
                cmarray[i]= new CongressMembers();
            }

            Scanner sc2 = new Scanner(f);
            Scanner sc3 = new Scanner(f);
            for(int i = 0; i < amount; i++){
                cmarray[i].setName(sc2.next() + " " + sc2.next());
                cmarray[i].setAverage((sc2.nextDouble() + sc2.nextDouble() + sc2.nextDouble() + sc2.nextDouble() + sc2.nextDouble()) / 5);

            }
            for(int j = 0; j < amount; j++){ // goes through the first name and last name then sets the five doubles to the arraay
                sc3.next();
                sc3.next();
                cmarray[j].setValues(sc3.nextDouble() + " " + sc3.nextDouble() + " " + sc3.nextDouble() + " " + sc3.nextDouble() + " " + sc3.nextDouble());
            }

            FileWriter writer = new FileWriter("output.txt");
            PrintWriter print = new PrintWriter(writer);
            cmarray = sortByFirstName(cmarray);
            print.println(amount + " members");
            print.println("Sorted by first name");
            print.println();
            print.println();

            for(int i = 0; i < amount; i++){
                print.println(cmarray[i].getName() + " " + cmarray[i].getValues());


            }
            print.println();
            print.println();

            cmarray = sortByApprovalRating(cmarray);
            print.println("Sorted by approval rating");
            print.println();
            for(int i = 0; i < amount; i++){
                print.println(cmarray[i].getName() + " " + cmarray[i].getValues());


            }
            print.flush();
            print.close();

        }
        catch(FileNotFoundException ex) { //this prints file not found instead of giving an error if the file isnt found
            System.out.println("File not found");
        }


    }
    public static CongressMembers[] sortByFirstName(CongressMembers array[]){
        for(int i = 0; i < array.length - 1; i++){ //bubble sort
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j].getName().compareTo(array[j+1].getName()) > 0){
                    CongressMembers temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;

    }
    public static CongressMembers[] sortByApprovalRating(CongressMembers array[]){
        for(int i = 0; i < array.length - 1; i++){ //bubble sort
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j].getAverage() < array[j+1].getAverage()){
                    CongressMembers temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;


                }
            }
        }
        return array;

    }

}