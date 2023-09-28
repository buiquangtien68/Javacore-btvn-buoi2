import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho:");
        String name =scanner.nextLine();
        System.out.println("Tên hàng nhập kho là:" +name);

        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd):");
        LocalDate daTime1=LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Ngày tháng năm sinh của bạn là: " +daTime1);

        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss):");
        LocalDateTime dateTime2=LocalDateTime.parse(scanner.nextLine(),DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("Thời gian bạn nhập hàng là:" +dateTime2);

        System.out.println("Mời bạn nhập thời gian:");
        LocalTime dateTime3=LocalTime.parse(scanner.nextLine(),DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Thời gian bạn nhập là:"+dateTime3);

    }
}
