package com.company.Task7;

public class Enclosing {

    private int enclosingPrivate=10;
    private static int enclosingPrivateStatic=10;

    int enclosingLocal=10;
    static int enclosingLocalStatic=10;

    public class InnerClass{
        int innerClass = 10;
        //static int innerStatic  = 10;     Inner classes cannot have static declaration
        void innerClassMethod(){
            enclosingPrivate = 20;
            enclosingPrivateStatic = 20;
            System.out.println("Object of Inner Class." +
                    "\n\tEnclosingPrivate = "+enclosingPrivate+
                    "\n\tEnclosingPrivateStatic = "+enclosingPrivateStatic
            );
        }
    }

    public static class StaticInnerClass{
        int innerClass = 10;
        static int innerClassStatic = 10;
        void staticInnerClassMethod(){
            enclosingPrivateStatic = 30;
            System.out.println("Object of Static Inner Class." +
                    "\n\tEnclosingPrivateStatic = "+enclosingPrivateStatic
            );
        }
    }
    void print(){;
    }
}
