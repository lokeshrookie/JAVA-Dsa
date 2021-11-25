package com.Lokesh.Queue;

import javax.print.attribute.DateTimeSyntax;
import javax.xml.crypto.Data;
import java.io.DataInput;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(dtf.format(ld));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date and Time : " + localDateTime);
    }
}
