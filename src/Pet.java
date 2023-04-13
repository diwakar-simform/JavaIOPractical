import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Pet {
    public static void main(String[] args) {

        try {
            // creating a file and writing into it.
            FileOutputStream file = new FileOutputStream("myPet.txt");
            String str = "I have a dog as my pet. His name is sumo.";
            byte[] text = str.getBytes();
            file.write(text);
            System.out.println("--------------File written successful--------------\n");


            // Reading File & printing into console
            System.out.println("<-------------File Reading Starts------------->");
            System.out.print("File content : ");
            FileInputStream myfile = new FileInputStream("myPet.txt");
            int i;
            while ((i=myfile.read())!=-1){
                System.out.print((char)i);
            }
            System.out.println("\n<-------------File Successfully readed------------->\n");

            // Closing opened files
            file.close();
            myfile.close();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
