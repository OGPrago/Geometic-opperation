import java.util.Scanner;

public class W3GeometicOpSwitch {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println(
                "Which Geometic Operation do you want to compute? " + "0 = Rectangle, 1 = Triangle, 3 = Trapazoid");
        int shape = kbd.nextInt();
        System.out.println("Do you want to compute area(0) or pereimeter(1)?");
        int formula = kbd.nextInt();

    }
}

/*
 * 1a. Write this program with if-else1b. Write this program with switch Assume
 * all int Write a program that asks the user which geometric operation he or
 * she wants to compute Rectangle, Triangle, Trapezoid0 = Rectangle, 1 =
 * Triangle, 2 = Trapezoid Then ask the user if he or she wants to compute area
 * or perimeter0 = area, 1 = perimeter Then prompt the user for the required
 * values, length, width, a, b1... Display the result of the computation
 * Rectangle area = length X widthperimeter = 2 X lengths + 2 X width Triangle
 * area = 1/2 of the base X the height perimeter = a + b + c Trapezoid area =
 * 1/2 of the base X the heightperimeter = a + b1 + b2 + c
 */