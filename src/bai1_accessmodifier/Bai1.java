package bai1_accessmodifier;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        System.out.print("Ban kinh: " + cr.getRadius() + " va Mau sac: " + cr.getColor() + "\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh moi: ");
        int r = input.nextInt();
        cr.setColor("blue");
        System.out.println("New Color: " + cr.getColor());
        cr.setRadius(r);
        System.out.println("New Radius: " + cr.getRadius());
        cr.Arena();

    }
}
