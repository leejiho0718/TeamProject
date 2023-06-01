package assignment_9._2_LogFile;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Log{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileWriter fileWriter = null;
        
        System.out.println("문장을 입력하시고 종료를 원하시면 \"end\"를 입력해주세요");
        
        try {
            fileWriter = new FileWriter("log.txt"); 

            String text;
            while (true) {
                System.out.print("문장을 입력하세요: ");
                text = input.nextLine();

                if (text.equalsIgnoreCase("end")) {
                    break;
                }

                String time = getTimestamp();
                String logEntry = time + " " + text + "\n";
                fileWriter.write(logEntry);
                fileWriter.flush();
            }
        }
        
        catch (IOException e) {
            e.printStackTrace();
        } 
        
        finally {
        	
            if (fileWriter != null) {
            	
                try {
                    fileWriter.close();
                } 
                
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            input.close();
        }
    }

    private static String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}

