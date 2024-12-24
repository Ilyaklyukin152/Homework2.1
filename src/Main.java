public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        var FirstBoxerWeight = 78.2;
        var SecondBoxerWeight = 82.7;
        var sumWeight = FirstBoxerWeight + SecondBoxerWeight;
        var differenceWeight = Math.abs(FirstBoxerWeight - SecondBoxerWeight);
        System.out.println("Общая масса двух бойцов равна " + sumWeight + " килограмм");
        System.out.println("Разница масс двух бойцов равна " + differenceWeight + " килограмм");
        //Задача 7
        var remOfDiv = SecondBoxerWeight%FirstBoxerWeight;
        System.out.println("Остаток от деления равен " + remOfDiv);
        //Задача 8
        var allTime = 640;
        var timeOne = 8;
        var worker = allTime/timeOne;
        System.out.println("Всего работников в компании " + worker + " человек");
        worker = worker + 94;
        allTime = timeOne * worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");

    }
}