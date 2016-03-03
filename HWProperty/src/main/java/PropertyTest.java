import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class PropertyTest {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Properties properties = new Properties();
        InputStream resourceAsStream = PropertyTest.class.getResourceAsStream("/user_config_data_set.properties");
        properties.load(resourceAsStream);

        FileReader fileReader = new FileReader("C:/configure.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

       /* while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);
            if(properties.containsKey(line) ){
                 //line.equals(properties.getProperty(line));

                System.out.println(line + "" + properties.get(line));
            }else System.out.println("is not available");
        }
        bufferedReader.close();
        fileReader.close();*/


        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);
            if(properties.getProperty(line) != null){
                // line.equals(properties.getProperty(line));

                System.out.println(line + "" + properties.get(line));
            }else System.out.println("is not available");
        }
        bufferedReader.close();
        fileReader.close();



      /*  System.out.println(properties.get("username" + "password" + "company"));*/


    }
}
