package lambdasinaction.chap3;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class LambdasTest {

    public static void main(String[] args) throws IOException {
        LambdasTest.processFile((BufferedReader b) -> b.readLine() + b.readLine());
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            return p.process(br);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void simpleTest() {
        Runnable r = () -> {
            System.out.println("heelo");
        };
        r.run();
    }

}