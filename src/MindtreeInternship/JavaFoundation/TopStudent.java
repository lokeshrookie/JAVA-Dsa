package MindtreeInternship.JavaFoundation;

import java.util.Scanner;

public class TopStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total_students = s.nextInt();
        Student student = new Student();
       Student[] students = new Student[total_students];
       // creating objects for all students . if not created, we will enccounter null pointer exception
        for(int i = 0; i<total_students; i++){
            students[i] = new Student();
        }

//        taking inputs for all the students
        for(int i = 0; i<total_students; i++){
            System.out.println("Enter id of student" + i + ": ");
            int id = s.nextInt();
            students[i].setId(id);
            System.out.println("Enter branch of student" + i + ": ");
//            System.out.println();
            String branch = s.next();
            students[i].setBranch(branch);
            System.out.println("Enter name of student" + i + ": ");
//            System.out.println();
            String  name = s.next();
            students[i].setName(name);
//            System.out.println();
            System.out.println("Enter score of student" + i + ": ");
            int score = s.nextInt();
            students[i].setScore(score);
        }

        // printing topper
        System.out.println("Topper is: " + topper(students, total_students).getName());
    }
    // method to return the student with the highest marks.
    public static Student topper(Student[] students, int total_students){
        Student topper = students[0];
        for(int i = 0; i<students.length; i++){
            if(students[i].getScore() > topper.getScore()){
                topper = students[i];
            }
        }
        return topper;

    }
}

class Student{
    private int id = 0;
    private String name = " ";
    private String branch = " ";
    private int score =  0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
