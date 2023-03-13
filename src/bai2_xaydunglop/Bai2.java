package bai2_xaydunglop;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Student st = new Student();
        System.out.print("Student:\n name: " + st.getName() + " va classes: " + st.getClasses() + "\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten moi: ");
        String name = input.nextLine();
        System.out.print("Nhap lop moi: ");
        String classes = input.nextLine();
        st.setName(name);
        st.setClasses(classes);
        System.out.print("Student New:\n name: " + st.getName() + " va classes: " + st.getClasses() + "\n");
    }
}
