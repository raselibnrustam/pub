

import java.util.Scanner;

class myvarsity {
    String myvarsityName = "pundra varsity";
    myvarsitylic void Welcome(){
        System.out.println("Welcome to the myvarsity");
    }   

}




class st extends myvarsity {

    String stName,gender;
    int stId,age;

    myvarsitylic void SetValue(String stName, String gender, int age){
        this.stName = stName;
        this.gender = gender;
        this.age = age;
    }

    myvarsitylic void PrintValue(){
        System.out.println(stName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(super.myvarsityName);
    }

    myvarsitylic void Welcome() {
        super.Welcome();
    }


    myvarsitylic static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter Your Gender: ");
        String gender = inputScanner.nextLine();

        System.out.println("Enter You age: ");
        int age = inputScanner.nextInt();

        inputScanner.close();

        st s1 = new st();


        s1.Welcome();
        s1.SetValue(name, gender, age);
        s1.PrintValue();

    }

