package ru.spbstu.telematics.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    @Test
    public void test() throws IOException {

        //Create a Folder with a few files in c:\\temp, which we can copy later and compare


        File originalFolder = new File("c:\\temp");
        File  copyFolder = new File("c:\\tempNew");

        main.copyFolder(originalFolder,copyFolder);


        String files[] = originalFolder.list();
        String copied[] = originalFolder.list();

        Assert.assertArrayEquals(files,copied);
    }
}
