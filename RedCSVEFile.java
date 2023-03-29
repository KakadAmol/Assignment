import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RedCSVEFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("/D:/AK/companycode.csv/"));
        sc.useDelimiter(",");
        while (sc.hasNext());
        {
            System.out.println(sc.next());
        }

        sc.close();
    }
}
