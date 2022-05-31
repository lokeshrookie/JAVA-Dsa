package capegemini;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String  city = s.next();
        Person[] person = new Person[3];

//
        person[0] = new Person(1111,"abcd@gamil.com", "pass1234", "sudha" , "Majji",
                "Bangalore", "Female", 99887766);
        person[1]  = new Person(2222,"abcd@gamil.com", "pass1234", "Rani" , "Majji",
                "Hyderabad", "Female", 99887766);
        person[2]  = new Person(3333,"abcd@gamil.com", "pass1234", "Smiley" , "Queen",
                "Pune", "Female", 99887766);

        for(int i = 0; i<3; i++){
            if(person[i].city.equals(city)){
//                Person.Display(person[i]);
                person[i].Display();
                return;
            }

        }
        System.out.println("No City Found");







    }
}

class Person{
     int userId;
     String emailId;
     String password;
     String fname;
     String lname;
     String city;
     String gender;
     long phone;

    Person(int userId, String emailId, String  password, String fname, String  lname, String  city, String  gender, long phone){
        this.emailId = emailId;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.gender = gender;
        this.phone = phone;
        this.userId =userId;
    }

    public   void Display(){
        System.out.println("Customer [userId:"+ userId + ", emailId:"+emailId + ", password:"+ password + ", firstName:"+fname
        + ", lastName:"+lname + ", city:"+city + ", gender:"+gender + ", phone:"+phone+"]");

    }
}