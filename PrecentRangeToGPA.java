import java.util.Scanner;
public class PrecentRangeToGPA {
    public static void main(String[] args){ 
        double precent;
     //String GPA;

precent = 97;
Scanner scan = new Scanner(System.in);
System.out.print("Enter precent: ");
precent = scan.nextDouble();

if (precent >=95) {
    System.out.println("GPA =4.0"); 
} 
else if (precent >=94 && precent <95){
    System.out.println("GPA [ 3.9 ]");
}
else if (precent >=93 && precent <94){
    System.out.println("GPA [ 3.8 ]");
}
else if (precent >=92 && precent <93){
    System.out.println("GPA [ 3.7 ]");
}
else if (precent >=91 && precent <92){
    System.out.println("GPA [ 3.6 ]");
}
else if (precent >=90 && precent <91){
    System.out.println("GPA [ 3.5 ]");
}
else if (precent >=89 && precent <90){
        System.out.println("GPA [ 3.4 ]");
}
else if (precent >=88 && precent <89){
     System.out.println("GPA [ 3.3 ]");
}
else if (precent >=87 && precent <88){
    System.out.println("GPA [ 3.2 ]");
}
else if (precent >=86 && precent <87){
    System.out.println("GPA [ 3.1 ]");
}
else if (precent >=85 && precent <86){
    System.out.println("GPA [ 3.0 ]");
}
else if (precent >=84 && precent <85){
    System.out.println("GPA [ 2.9 ]");
}
else if (precent >=83 && precent <84){
    System.out.println("GPA [ 2.8 ]");
}
else if (precent >=82 && precent <83){
    System.out.println("GPA [ 2.7 ]");
}
else if (precent >=81 && precent <82){
    System.out.println("GPA [ 2.6 ]");
}
else if (precent >=80 && precent <81){
    System.out.println("GPA [ 2.5 ]");
}
else if (precent >=79 && precent <80){
    System.out.println("GPA [ 2.4 ]");
}
else if (precent >=78 && precent <79){
    System.out.println("GPA [ 2.3 ]");
}
else if (precent >=77 && precent <78){
    System.out.println("GPA [ 2.2 ]");
}
else if (precent >=76 && precent <77){
    System.out.println("GPA [ 2.1 ]");
}
else if (precent >=75 && precent <76){
    System.out.println("GPA [ 2.0 ]");
}
else if (precent >=74 && precent <75){
    System.out.println("GPA [ 1.9 ]");
}
else if (precent >=73 && precent <74){
    System.out.println("GPA [ 1.8 ]");
}
else if (precent >=72 && precent <73){
    System.out.println("GPA [ 1.7 ]");
}
else if (precent >=71 && precent <72){
    System.out.println("GPA [ 1.6 ]");
}
else if (precent >=70 && precent <71){
    System.out.println("GPA [ 1.5 ]");
}
else if (precent >=69 && precent <70){
    System.out.println("GPA [ 1.4 ]");
}
else if (precent >=68 && precent <69){
    System.out.println("GPA [ 1.3 ]");
}
else if (precent >=67 && precent <68){
    System.out.println("GPA [ 1.2 ]");
}
else if (precent >=66 && precent <67){
    System.out.println("GPA [ 1.1 ]");
}
else if (precent >=65 && precent <66){
    System.out.println("GPA [ 1.0 ]");
}
else if (precent <=65) {
    System.out.println("GPA [ 0.0 ]");
}
}
}

