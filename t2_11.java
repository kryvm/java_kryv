public class Car {
    private String surname;
    private String initials;
    private int busNum;
    private int routeNum;
    private String brand;
    private int yearStart;
    private int runSofar;

    public Car(String surname1, String initials1, int busNum1, int routeNum1, String brand1, int yearStart1, int runSofar1)
    {
        surname = surname1;
        initials = initials1;
        busNum = busNum1;
        routeNum = routeNum1;
        brand = brand1;
        yearStart = yearStart1;
        runSofar = runSofar1;
    }

    public String getSurname() {
        return surname;
    }

    public int getBusNum() {
        return busNum;
    }

    public int getRouteNum() {
        return routeNum;
    }

    public int getRunSofar() {
        return runSofar;
    }

    public int getYearStart() {
        return yearStart;
    }

    public String getBrand() {
        return brand;
    }

    public String getInitials() {
        return initials;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBusNum(int busNum) {
        this.busNum = busNum;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setRouteNum(int routeNum) {
        this.routeNum = routeNum;
    }

    public void setRunSofar(int runSofar) {
        this.runSofar = runSofar;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public String toString() {
        return "Driver is " + this.surname + " " + this.getInitials() + " Bus number is " + this.busNum + " Route number is " + this.routeNum +
                " Brand of bus is " + this.brand + " travelled so far " + this.runSofar +" km from " + this.yearStart;
    }

    public static void main(String[] args) {
        Car bus1 = new Car("Ivanchenko","M.I.",12623,765,"VOLVO",2001,23100);
        Car bus2 = new Car("Derevenko","A.V.",64233,765,"KIA",2015,1527);
        Car bus3 = new Car("Shevchenko","B.A.",14243,321,"RENAULT",2005,2537);
        Car bus4 = new Car("Usichenko","I.K.",12525,526,"VOLVO",2003,7426);
        Car bus5 = new Car("Ukrainec","S.K.",16246,13,"BOHDAN",2013,15247);
        Car bus6 = new Car("Zelenskiy","V.A.",42521,532,"VOLVO",2016,17352);
        Car[] obj = {bus1,bus2,bus3,bus4,bus5,bus6};

        System.out.println("List of buses with Route number 765 : ");
        for(int i = 0; i < obj.length; i++) {
            if (obj[i].getRouteNum() == 765) {
                System.out.println(obj[i].toString());
            }
        }

        System.out.println("List of buses that have been using for more than 15 years : ");
        for(int i = 0; i < obj.length; i++) {
            if (2022 - obj[i].getYearStart() >= 15) {
                System.out.println(obj[i].toString());
            }
        }

        System.out.println("List of buses that have been using for more than 10000km : ");
        for(int i = 0; i < obj.length; i++) {
            if (10000 - obj[i].getRunSofar() <= 0) {
                System.out.println(obj[i].toString());
            }
        }
    }
}
