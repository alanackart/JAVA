import java.io.*;
        import java.nio.charset.Charset;

public class AddStringEveryXLine {
    public static void main(String[] args) throws IOException {
        String in_file = "gentbl.sql";
        String out_file = in_file + ".added_commit";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(in_file), "GB2312")); PrintWriter printWriter = new PrintWriter(new FileWriter(out_file))) {
            int num = 1;
            int x_line = 50; // every x line
            String add_string = "commit;";
            String match_string = ");";
            for (String line; (line = br.readLine()) != null; num++) {
                printWriter.println(line);
                if((num % x_line == 0) &&  line.contains(match_string)){
                    printWriter.println(add_string);
                }
            }
            printWriter.println(add_string);
            br.close();
            printWriter.close();
        }
    }
}
