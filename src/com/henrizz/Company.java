package com.henrizz;

import java.text.NumberFormat;

public class Company {
    private final IPayable[] payables;
    private int payableCount;

    public Company(int maxPayables) {
        payables = new IPayable[maxPayables];
        payableCount = 0;
    }

    public void addPayable (IPayable payable) {
        if (payableCount < payables.length) {
            payables[payableCount] = payable;
            payableCount++;
            System.out.println("Đã thêm thành công.");
        }
        else
            System.out.println("Đã đạt giới hạn. Không thể thêm.");
    }

    public void displayAllPayrolls() {
        if (payableCount == 0)
            System.out.println("Chưa có thông tin.");
        else {
            System.out.println("Số lượng người nhận lương: " + payableCount);
            for (int i = 0; i < payableCount; i++) {
                showPayableInfo(i);
            }
        }
    }

    public void findEmployeeById(String id) {
        if (payableCount == 0) {
            System.out.println("Chưa có thông tin của nhân viên nào.");
            return;
        }
        boolean result = false;
        for (int i = 0; i < payableCount; i++) {
            if ((payables[i] instanceof Employee) && (id.equals(((Employee)payables[i]).getId()))) {
                showPayableInfo(i);
                result = true;
            }
        }
        if (!result)
            System.out.println("Không tìm thấy kết quả.");
    }

    //Implemented Method:
    private void showPayableInfo(int i) {
        System.out.println("\n=== Thông Tin Người Nhận Lương ===");
        System.out.println("-,Tên người nhận: " + payables[i].getName());
        System.out.println("-,Số tiền: " + NumberFormat.getCurrencyInstance().format(payables[i].calculateSalary()));
    }

}
