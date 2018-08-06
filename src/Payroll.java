import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        int heso;
        System.out.println("Nhap vao he so luong: ");
        Scanner sc = new Scanner(System.in);
        heso = sc.nextInt();
        System.out.println("Nhap vao so nam lam viec: ");
        int year = sc.nextInt();
        switch (heso) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Luong thang: "+ (heso*4000000 + year*500000));
                break;
            default:
                System.out.println("He so nhap vao khong hop le !");

        }

    }
}
