import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ReverseLines
{

    public static void main(String[] args) {
        ArrayList<String> listOfLines = new ArrayList<>();
        try {
            File file = new File("D://Всячина/Test.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);

            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                listOfLines.add(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
            System.out.println(listOfLines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        listOfLines.sort(Comparator.reverseOrder());
        System.out.println(listOfLines);
        try
        {
            File fileOutput = new File("D://Всячина/TestFinal.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(fileOutput);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            Writer writer = new BufferedWriter(outputStreamWriter);
            Iterator<String> iteratorOfLinesToFile = listOfLines.iterator();
            while(iteratorOfLinesToFile.hasNext())
            {
                writer.write(iteratorOfLinesToFile.next() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
