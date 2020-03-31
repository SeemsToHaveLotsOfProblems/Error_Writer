import java.io.*;

public class FileHandler {

    //Global array for storing file data
    static String[] data = new String[50];

    public static void fileReader(String filePath) throws FileNotFoundException {
        /*
         * File reader now works and will store data into a 50 line array.
         * Use the array to work with data needed from the file
         */
        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);

        try {
            String lineData;
            int line = 1;
            lineData =  reader.readLine();
            data[line] = lineData;
            System.out.println(lineData);
            while(lineData != null){
                line++;
                lineData = reader.readLine();
                data[line] = lineData;
                System.out.println(lineData);
            }

        } catch (IOException e){
            e.printStackTrace();
        }


    }

}//End class
