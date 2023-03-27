import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn db.file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();


        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);

    }
}
