public class Ans4 {
    public static void main(String[] args) {
        //Leap year 4 outputs
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        System.out.println("--------------------------------------------------");
        //5 outputs to get days in a month
        getDaysInMonth(1, 2020); // should return 31 days
        getDaysInMonth(2, 2020);// should return 29 days because 2020 is leap year
        getDaysInMonth(2, 2018);// should return 28 days because 2018 is not leap year
        getDaysInMonth(-1, 2020);// should return -1 as parameter month is not valid
        getDaysInMonth(1, -2020);//should return -1 since parameter year is invalid
    }

    public static boolean isLeapYear(int year) {
        boolean a;
        if (year <= 1 || year >= 9999) {
            a = false;
            System.out.println(a + " since paramters are out of range (1-9999)");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            a = true;
            System.out.println(a + " since " + year + " is leap year");
        } else {
            a = false;
            System.out.println(a + " since " + year + " is not leap year");
        }
        return a;
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("31");
                }
                break;
            case 2:
                if (month == 2 && year % 4 == 0 && year % 100 != 0) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
                break;
            case 3:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("31");
                }
                break;
            case 4:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("30");
                }
                break;
            case 5:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("31");
                }
                break;
            case 6:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("30");
                }
                break;
            case 7:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("31");
                }
                break;
            case 8:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("31");
                }
                break;
            case 9:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("30");
                }
                break;
            case 10:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("31");
                }
                break;
            case 11:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("30");
                }
                break;
            case 12:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid year");
                } else {
                    System.out.println("31");
                }
                break;
            default:
                System.out.println("Invalid Month");
                System.out.println("Invalid Year");
                break;
        }
        return 0;

        }
    }

