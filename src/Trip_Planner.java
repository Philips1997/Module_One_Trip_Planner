import java.util.Scanner;
public class Trip_Planner {
    public static void main (String[] args){
        System.out.println("Welcome to Vacation Planner!");
        intro();
        budgetAdate();
        time();
        area();
    }

    public static void intro (){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String Name = input.next();
        System.out.print("Nice to meet you, "+ Name +", where are you traveling to? ");
        String Destination = input.next();
        System.out.println("Great! "+ Destination +" sounds like a great trip");
        System.out.println("*********");
        // take in user's name and destination
    }

    public static void budgetAdate (){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int NoDays = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int USDAmount = input.nextInt();
        System.out.print("What is the currency symbol for their destination? ");
        String CurrencySymbol = input.next();
        System.out.print("The conversion rate between 1 USD to however many of that destinations currency. ");
        double Conversion = input.nextDouble();
        int NoHours = NoDays * 24;
        int NoMins = NoHours * 60;
        double TargetCurrencyAmount = USDAmount * Conversion;
        double USDAmountDouble = (double) USDAmount;
        double USDAmountDoublePerDay = USDAmountDouble/NoDays;
        double TargetCurrencyAmountPerDay = TargetCurrencyAmount/NoDays;
        System.out.println("If you are travelling for "+ NoDays +" days, that is same as " + NoHours +" hours or " + NoMins +" minutes.");
        System.out.println("If you are going to spend $" + USDAmount +" that means per day you would spend $" + USDAmountDoublePerDay + "per day.");
        System.out.println("Your total budget in " + CurrencySymbol + " is " + TargetCurrencyAmount + " " + CurrencySymbol +" which per day is " + TargetCurrencyAmountPerDay + " " + CurrencySymbol);
        System.out.println("*********");
        // make conversions of date and budget
    }

    public static void time (){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int TimeDifference = input.nextInt();
        int MidNightInDestination = TimeDifference % 24;
        int NoonInDestination = (TimeDifference + 2) % 24;
        System.out.println("That means, when it's midnight at home, it would be " + MidNightInDestination + ":00 in your travel destination, and when it's noon at home, it would be" + NoonInDestination + ":00 at travel destination");
        System.out.println("*********");
        // calculate the time difference
    }

    public static void area (){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area of your destination country in km2?");
        int AreaInKm = input.nextInt();
        double AreaInMile = AreaInKm * 0.6237;
        System.out.println("In mile2, that is " + AreaInMile);
        System.out.println("*********");
        // calculate the area of destination country
    }
}
