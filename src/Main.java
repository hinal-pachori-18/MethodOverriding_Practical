//create a class Employee which contain display salary method.
class Employee {
    public void displaySal(int MinSalary) {
        System.out.println("Salary of Employee is : " + MinSalary);
    }
}

//create a another class Programmer which extend Employee class which define same method.
class Programmer extends Employee {
    @Override
    public void displaySal(int minSalary) {
        int ProgSalary = minSalary + 2000;
        System.out.println("Salary of Programmer is : " + ProgSalary);
    }
}

//create a class main
class Main {
    public static void main(String[] args) {
        //create an object of Programmer class and call method.
        Programmer obj1 = new Programmer();
        obj1.displaySal(3000);
        //create an object of Employee class and call method.
        Employee obj2 = new Employee();
        obj2.displaySal(3000);

    }
}