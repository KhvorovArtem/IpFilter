package ua.khvorov.ipfilter.starter;

import ua.khvorov.ipfilter.service.FileService;


/**
 * Created by umb on 05.12.13.
 */
public class Starter {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.readFile();
    }
}
