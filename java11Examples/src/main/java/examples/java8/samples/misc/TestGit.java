package examples.java8.samples.misc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestGit {

    public static void main(String[] args) {
        System.out.println("i will test the git in this project");
        System.out.println("sometimes sometimes.");


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDate = LocalDate.now();

    }
}
