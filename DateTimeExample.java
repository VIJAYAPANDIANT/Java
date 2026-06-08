/* 

Date & Time in Java (java.time package)

Definition:
- Introduced in Java 8, the java.time package provides immutable, thread-safe date-time classes that are much cleaner than old Date and Calendar APIs.

Key Classes:

1. LocalDate:
   - Represents a date (year, month, day) without a time-zone or time.
   - e.g., 2026-06-08

2. LocalTime:
   - Represents a time (hour, minute, second, nanosecond) without a date or time-zone.

3. LocalDateTime:
   - Combines LocalDate and LocalTime.

4. ZonedDateTime:
   - Represents a date-time with a time-zone (e.g., Europe/Paris, Asia/Kolkata).

5. DateTimeFormatter:
   - Used for parsing and formatting date-time objects.

Syntax:
LocalDate date = LocalDate.now();
ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("timezone"));
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("pattern");

*/

import java.time.*;
import java.time.format.DateTimeFormatter;

class DateTimeExample {
    public static void main(String[] args) {
        // 1. LocalDate Usage
        System.out.println("--- LocalDate Examples ---");
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        LocalDate birthDate = LocalDate.of(1995, 5, 20);
        System.out.println("Specific Date: " + birthDate);

        LocalDate plusOneWeek = today.plusWeeks(1);
        System.out.println("Date in 1 week: " + plusOneWeek);

        // 2. ZonedDateTime Usage
        System.out.println("\n--- ZonedDateTime Examples ---");
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println("Current Zone Date-Time: " + currentZonedDateTime);

        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Time in Tokyo: " + tokyoTime);

        // 3. Formatting Date-Time
        System.out.println("\n--- DateTimeFormatter Examples ---");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        String formatted = currentZonedDateTime.format(formatter);
        System.out.println("Formatted Date-Time: " + formatted);
    }
}
