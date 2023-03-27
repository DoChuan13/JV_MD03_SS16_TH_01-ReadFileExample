import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) throws IOException {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc có lỗi");
        }
    }
}
