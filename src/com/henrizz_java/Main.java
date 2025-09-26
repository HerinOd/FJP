package com.henrizz_java;

import java.util.Scanner;

public class Main {
//Hi, Hello World, check check 123....
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company(3);
        while (true) {
            byte choice;
            menuCompanyManager();
            choice = scanner.nextByte(); scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Hãy nhập ID của nhân viên mà bạn muốn tìm: ");
                    String id = scanner.nextLine();
                    company.findEmployeeById(id);
                    break;
                case 2:
                    company.displayAllPayrolls();
                    break;
                case 3:
                    NewManagerInfo newManagerInfo = newManagerInfoInput();
                    company.addPayable(new Manager(newManagerInfo.id, newManagerInfo.name, newManagerInfo.baseSalary, newManagerInfo.bonus));
                    break;
                case 4:
                    NewEmployeeInfo newEmployeeInfo = newEmployeeInfoInput();
                    company.addPayable(new RegularEmployee(newEmployeeInfo.id, newEmployeeInfo.name, newEmployeeInfo.salary));
                    break;
                case 5:
                    NewContractorInfo newContractorInfo = newContractorInfoInput();
                    company.addPayable(new Contractor(newContractorInfo.name, newContractorInfo.hourlyRate, newContractorInfo.hoursWorked));
                    break;
                case 6:
                    System.out.println("Đang thoát...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        }
    }

    //=========================================================================
    //Implementation của menu 5:
    public static NewContractorInfo newContractorInfoInput() {
        System.out.println("Nhập thông tin Contractor mới: ");
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Tiền Lương/Giờ: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Số giờ làm việc: ");
        int hoursWorked = scanner.nextInt(); scanner.nextLine();
        return new NewContractorInfo(name, hourlyRate, hoursWorked);
    }

    public record NewContractorInfo(String name, double hourlyRate, int hoursWorked) {}
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    //=========================================================================
    //Implementation của menu 4:
    public static NewEmployeeInfo newEmployeeInfoInput() {
        System.out.println("Nhập thông tin Employee mới: ");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Tiền Lương: ");
        double salary = scanner.nextDouble(); scanner.nextLine();
        return new NewEmployeeInfo(id, name, salary);
    }

    public record NewEmployeeInfo(String id, String name, double salary) {}
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    //=========================================================================
    //Implementation của menu 3:
    public static NewManagerInfo newManagerInfoInput() {
        System.out.println("Nhập thông tin Manger mới: ");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Lương cứng: ");
        double baseSalary = scanner.nextDouble();
        System.out.print("Tiền thưởng: ");
        double bonus = scanner.nextDouble(); scanner.nextLine();
        return new NewManagerInfo(id, name, baseSalary, bonus);
    }

    public record NewManagerInfo(String id, String name, double baseSalary, double bonus) {}
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    public static void menuCompanyManager() {
        System.out.println(" ");
        System.out.println("====== COMPANY MANAGER ======");
        System.out.println("1. Tìm nhân viên.");
        System.out.println("2. Hiển thị bảng lương công ty.");
        System.out.println("3. Thêm Manager cho dự án.");
        System.out.println("4. Thêm Employee cho dự án");
        System.out.println("5. Thêm Contractor cho dự án.");
        System.out.println("6. Thoát ứng dụng.");
        System.out.print("Hãy chọn một mục: ");
    }

}