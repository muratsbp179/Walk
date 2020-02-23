import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public  class HW1 {
    //cmd + p - param
    //cmd + click - code

    void copy(String from, String to) throws IOException {
        Reader reader = new FileReader(from, StandardCharsets.UTF_8);
        Writer writer = new FileWriter(to, StandardCharsets.UTF_8);
        int c = 0;
        while ((c = reader.read()) >= 0){
            writer.write(Character.toUpperCase((char)c));
        }
        reader.close();
        writer.close();
    }

    public class Walk{


    }
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //String str = in.next();
        //PrintStream a = System.out; // сохронили поток вывода в отдельную переменную
        //a.print("Hello world");

//        ByteArrayOutputStream str = new ByteArrayOutputStream();
//        PrintStream c = new PrintStream(str); // подключили массив str к выводу
//        c.print("adsfasdf");

//        try {
//            String myAdr = "sadfkjlasd";
//            FileOutputStream myFile = new FileOutputStream("Abc.txt");
//            OutputStreamWriter buffFile = new OutputStreamWriter(myFile, "UTF8");
//            Writer out = new BufferedWriter(buffFile);
//            out.write(myAdr);
//        } catch (IOException e){
//            System.out.println("Can not write to file: " + e.toString());
//        }
//        ProcessBuilder processBuilder = new ProcessBuilder();
//        processBuilder.command("greadlink","-f","HW1.java");
//        try {
//            processBuilder.start();
//        } catch (IOException e) {
//            e.printStackTrace(new PrintStream());
//        }
//        File file = new File("/Users/user/IdeaProjects/Walk/src/");
//        try {
//            //byte[] b = new byte[1024];
//            FileInputStream fileInputStream = new FileInputStream(file);
//            int tmp = 0;
//            int available = fileInputStream.available();
//            System.out.println(available);
//            while ((tmp = fileInputStream.read()) >= 0){
//                System.out.print((char) tmp);
//            }
//            //System.out.println((char)a);
//        } catch (FileNotFoundException e) {
//            System.err.println("FileNotFound : " + e.toString());
//        } catch (IOException e) {
//            System.out.println(" IO " + e.toString());
//        }

        //newFile.getAbsoluteFile();
//        try (FileInputStream fileInputStream = new FileInputStream("test.txt")) {
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String fileSeparator = System.getProperty("file.separator");
        String absoluteFilePath = fileSeparator+"Users"+fileSeparator+"user"+fileSeparator+"IdeaProjects"+fileSeparator+"Walk"+fileSeparator+"src"+fileSeparator+str;
        //System.out.println(absoluteFilePath);
        File file = new File(absoluteFilePath);
        try{
            FileOutputStream myFile = new FileOutputStream(str + ".txt");
            OutputStreamWriter buffFile = new OutputStreamWriter(myFile, "UTF8");
            Writer out = new BufferedWriter(buffFile);
            String data = in.next();
            System.out.println(data);
            out.write(String.valueOf(data.getBytes()));
            myFile.flush();
            myFile.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
