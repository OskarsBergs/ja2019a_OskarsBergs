package lv.jg.lesson1;

import java.util.Scanner;

//nekompilējas - jāizlabo kļūdas
public class Lesson11  //šī rinda ir lieka
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Please enter linguee height");
        double height = scanner.nextInt();
        System.out.println("Please enter linguee width");
        double width = scanner.nextInt();
        double area = 2 * ((height + width));
        System.out.println("Area" + area);
//trūkst beigās aizverošo iekavu gan metodei gan klasei "}"