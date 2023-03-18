package com.fan.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Utility class for parsing the date
 *
 * @author  Suman Puthran
 */
public class DateParser {
    public static final String dateFormat = "yyyy-MMM-dd";
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

    /**
     * This method parses a String and returns a LocalDate of format yyyy-MMM-dd
     * @param date
     * @return
     */
    public static LocalDate parseDate(String date){
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        if (parsedDate == null)
            parsedDate = LocalDate.now();
        return parsedDate;
    }
}
