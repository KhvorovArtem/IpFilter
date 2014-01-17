package ua.khvorov.ipfilter.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class FileService {

    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.readFile();
    }

    public void readFile() {
        HashSet set = new HashSet();
        try {
            Scanner scanner = new Scanner(new File("D:\\error.txt"));
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                int beginIndex = str.lastIndexOf("[") + 1;
                int endIndex = str.lastIndexOf("]");
                if (beginIndex >= 0 && endIndex >= 0) {
                    set.add(str.substring(beginIndex, endIndex));
                }
            }

            System.out.println("Ips count = " + set.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}