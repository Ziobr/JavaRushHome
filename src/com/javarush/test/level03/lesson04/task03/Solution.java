package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg z1=new Zerg();
        z1.name = "z1";
        Zerg z2=new Zerg();
        z2.name = "z2";
        Zerg z3=new Zerg();
        z3.name = "z3";
        Zerg z4=new Zerg();
        z4.name = "z4";
        Zerg z5=new Zerg();
        z5.name = "z5";
        Zerg z6=new Zerg();
        z6.name = "z6";
        Zerg z7=new Zerg();
        z7.name = "z7";
        Zerg z8=new Zerg();
        z8.name = "z8";
        Zerg z9=new Zerg();
        z9.name = "z9";
        Zerg z10=new Zerg();
        z10.name = "z10";

        Protos p1 = new Protos();
        p1.name = "p2";
        Protos p2 = new Protos();
        p2.name = "p3";
        Protos p3 = new Protos();
        p3.name = "p4";
        Protos p4 = new Protos();
        p4.name = "p5";
        Protos p5 = new Protos();
        p5.name = "p6";

        Terran t1 = new Terran();
        t1.name = "t1";
        Terran t2 = new Terran();
        t2.name = "t2";
        Terran t3 = new Terran();
        t3.name = "t3";
        Terran t4 = new Terran();
        t4.name = "t4";
        Terran t5 = new Terran();
        t5.name = "t5";
        Terran t6 = new Terran();
        t6.name = "t6";
        Terran t7 = new Terran();
        t7.name = "t7";
        Terran t8 = new Terran();
        t8.name = "t8";
        Terran t9 = new Terran();
        t9.name = "t9";
        Terran t10 = new Terran();
        t10.name = "t10";
        Terran t11 = new Terran();
        t11.name = "t11";
        Terran t12 = new Terran();
        t12.name = "t12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}