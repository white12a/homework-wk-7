public class Person {
    String firstName, lastName;
    int age;
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }
    public String getTheFirstName(){
        return firstName;
    }
    public String getLastname(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;

    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if(age>0 || age<=100){
            this.age=age;
        }else{
            age=0;
        }

    }
    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }else{
            return false;
        }
    }
    public String getFullName(){

        if(firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        }else if(firstName.isEmpty()){
            return lastName;
        }else if(lastName.isEmpty()){
            return firstName;
        }else{
            return firstName+" "+ lastName;
        }

    }




}
