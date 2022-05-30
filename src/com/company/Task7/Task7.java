package com.company.Task7;

public class Task7 {

    private int privateVar = 100;

    public Task7(){

        Enclosing.InnerClass i = new Enclosing().new InnerClass();          //Create object of InnerClass
        i.innerClassMethod();
        System.out.println("\tInnerClass = "+(i.innerClass=20));

        Enclosing.StaticInnerClass s = new Enclosing.StaticInnerClass();    //Create object of StaticInnerClass
        s.staticInnerClassMethod();
        System.out.println("\tInnerClass = "+(s.innerClass=20));
        System.out.println("\tInnerClassStatic = "+(s.innerClassStatic=20));

        Enclosing e = new Enclosing(){                        //Create object of AnonymousClass

            @Override
            void print(){
                privateVar = 200;                  //Access to private elements of Task7 Class
                enclosingLocal=200;
                enclosingLocalStatic=200;
                System.out.println("Object of Anonymous Class." +
                        "\n\tPrivate variable of Task7 Class = "+privateVar+
                        "\n\tLocal variable of Enclosing Class = "+enclosingLocal+
                        "\n\tLocal Static variable of Enclosing Class = "+enclosingLocalStatic
                );
            }
        };
        e.print();

        class LocalClass{
            LocalClass(){
                privateVar = 300;                  //Access to private elements of Task7 Class
                System.out.println("Object of Local Class." +
                        "\n\tPrivate variable of Task7 Class = "+privateVar);
            }
        }
        LocalClass l = new LocalClass();                       //Create object of LocalClass
    }
}
