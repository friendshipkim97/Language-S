package com.language;

public class StackTest{

    static TypeEnv tenv = new TypeEnv();
    int i = 0;

    public void test4(){
        int i=0;
        int j=0;
        int k=0;
        i=1; j=1;
        while (i<=3) {
            j=1;
            while (j<=4) {
                k = i * j;
                System.out.print(i);
                System.out.print(j);
                System.out.print(k);
                j=j+1;
            }
            i = i+1;
        }
    }

    public void test5(){
            int i;
            int j;
            i = 10;
            j = 2;
            if (j > 0)
                i = i + j;
            else i = i - j;
            System.out.print(i);
    }

    public void test6(){
        int i = 1; int j = 2;
        System.out.print(i);
        if (i>0) i=i+j;
        else i=i-j;
        System.out.print(i);
    }


    public static void main(String[] args) {
//        int xva = 0;
//        System.out.println("x" + xva);
        StackTest stackTest = new StackTest();
//        TypeEnv tenv = new TypeEnv();
//        Identifier identifier = new Identifier("s");
//        Type type = new Type("Type.ARRAY");
//        tenv.push(identifier, type);
//        tenv.contains(identifier);
        stackTest.test6();
    }
}
