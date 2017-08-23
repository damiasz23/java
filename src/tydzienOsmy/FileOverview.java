package tydzienOsmy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by olaIdamian on 8/21/2017.
 */
public class FileOverview {
    public static void createDirectoryAndFIle() throws IOException {

        Scanner in = new Scanner(System.in);
//        1.Zapytanie o nazwe katalogu:
        System.out.println("Podaj nazwę katalogu");
        String directoryName = in.nextLine();

        File folder = new File(directoryName);

        if(folder.exists()){
            System.out.println("Katalog istnieje");
        }
        else{
            if(folder.mkdir()){
                System.out.println("Utworzono katalog");
            }
            else{
                System.out.println("Nie udało sie utworzyć");
            }
//            OPERATOR TROJARGUMENTOWY
//            System.out.println(file.mkdir() ? "Utworzono katalog : Nie udalo sięutwrzyć");
//            TO SAMO CO WYZEJ
        }
        createNote(in, directoryName);
    }

    private static void createNote(Scanner in, String directoryName) throws IOException {
        System.out.println("Podaj nazwę pliku");
        String fileName = in.nextLine();

        String note = getNote(in);

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(directoryName + "\\" + fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(note);
//            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(bufferedWriter !=null){
                try{
                    bufferedWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fileWriter!=null){
                try{
                    fileWriter.close();
                }catch (IOException e){
                    fileWriter.close();
                }
            }
        }
    }

    private static String getNote(Scanner in) {
        System.out.println("Podaj treść notatki");
        return in.nextLine();
    }

//    PO REFACTORINGU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



    public static void createDirectory(){

    }

    public static void createFileWithResources(String path){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            bufferedWriter.write("Wiadomość");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}