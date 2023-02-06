package model;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHandle {
  // get directory name
  // input is the full url of the website ending with /xxx.html
  // directory name is data/xxx
  public static String getDirName(String fullUrl) {
    int start = fullUrl.lastIndexOf("/");
    int end = fullUrl.lastIndexOf(".html");
    String dirName = fullUrl.substring(start + 1, end);
    return "data" + File.separatorChar + dirName;
  }

  // read HashMap from file
  public static HashMap<String, Double> readHashMap(String dirName, String firName)
      throws IOException {
    String filePath = dirName + File.separatorChar + firName;
    BufferedReader in = new BufferedReader(new FileReader(filePath));
    HashMap<String, Double> hashMap = new HashMap<>();
    String firstLine = in.readLine();
    while (firstLine != null) {
      String[] parts = firstLine.split(": ");

      String str = parts[0].trim();
      String d = parts[1].trim();

      if (!str.equals("") && !d.equals("")) {
        hashMap.put(str, Double.valueOf(d));
      }
      firstLine = in.readLine();
    }
    return hashMap;
  }

  // read text from file
  public static String readText(String dirName, String firName) throws IOException {
    String filePath = dirName + File.separatorChar + firName;
    BufferedReader in = new BufferedReader(new FileReader(filePath));
    return in.readLine();
  }

  // write list to file
  public static void writeList(String dirName, String firName, List<String> arr)
      throws IOException {
    String filePath = dirName + File.separatorChar + firName;
    Files.createDirectories(Paths.get(dirName));
    PrintWriter out = new PrintWriter(new FileWriter(filePath));
    for (String item : arr) {
      out.write(item);
      out.write("\n");
    }
    out.close();
  }

  // write HashMap to file
  public static void writeHashMapDouble(
      String dirName, String firName, HashMap<String, Double> hashMap) throws IOException {
    String filePath = dirName + File.separatorChar + firName;
    Files.createDirectories(Paths.get(dirName));
    PrintWriter out = new PrintWriter(new FileWriter(filePath));
    for (Map.Entry<String, Double> mapElement : hashMap.entrySet()) {
      out.write(mapElement.getKey() + ": ");
      out.write(String.valueOf(mapElement.getValue()) + "\n");
    }
    out.close();
  }

  public static void writeHashMapInteger(
      String dirName, String firName, HashMap<String, Integer> hashMap) throws IOException {
    String filePath = dirName + File.separatorChar + firName;
    Files.createDirectories(Paths.get(dirName));
    PrintWriter out = new PrintWriter(new FileWriter(filePath));
    for (Map.Entry<String, Integer> mapElement : hashMap.entrySet()) {
      out.write(mapElement.getKey() + ": ");
      out.write(String.valueOf(mapElement.getValue()) + "\n");
    }
    out.close();
  }

  // write text to file
  public static void writeText(String dirName, String firName, String text) throws IOException {
    String filePath = dirName + File.separatorChar + firName;
    Files.createDirectories(Paths.get(dirName));
    PrintWriter out = new PrintWriter(new FileWriter(filePath));
    out.write(text);
    out.close();
  }
}
