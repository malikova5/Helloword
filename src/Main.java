public class Main {
    public static void main(String[] args) {
    var dog=8.0;
    var cat = 3.6;
    var  paper =763789;
    System.out.println("собак"+ dog +"котов" +cat+"рулонов бумаги"+paper);
    dog = dog + 4.0;
    System.out.println("собака" + dog + "шт");
    cat = cat + 4;
    System.out.println("котов"+ cat +"шт");
    paper=paper + 4;
    System.out.println("рулонов бумаги" + paper + "шт");
    dog = dog - 3.5;
    System.out.println("собак осталось" + dog + "шт");
    cat = cat - 1.6;
    System.out.println("котов осталось"+ cat + "шт");
    paper = paper -7639;
    System.out.println("рулонов бумаги осталось" + paper +"шт");

    var friend = 19;
    System.out.println("дрезей"+ friend);
    friend=friend+2;
    System.out.println("стало друзей"+friend);
    friend=friend/7;
    System.out.println("осталось друзей"+ friend);

    var frog = 3.5;
    System.out.println("лягушка"+ frog);
    frog=frog*10;
    System.out.println( "стало  лягушек"+frog);
    frog=frog/3.5;
    System.out.println("осталось лягушек"+frog);
    frog=frog+4;
    System.out.println("всего лягушек"+frog);

    var WeightOneBoxer =78.2;
    var TheWeightOfTheSecondBoxer=82.7;
    System.out.println("масса одного боксера"+WeightOneBoxer+"масса второго боксера"+ TheWeightOfTheSecondBoxer);
    var TotalWeight =(WeightOneBoxer+TheWeightOfTheSecondBoxer);
    System.out.println( "общая масса"+TotalWeight);
    var difference = (TheWeightOfTheSecondBoxer-WeightOneBoxer);
    System.out.println("разница между массами бойцов"+difference);

    var remains = (TheWeightOfTheSecondBoxer/WeightOneBoxer);
    System.out.println("остаток"+remains);

     var Watch= 640;
     var HoursPerEmployee=8;
     System.out.println("часов"+Watch+"часов на одного сотрудника"+ HoursPerEmployee);
     var TotalEmployeesInTheCompany = (Watch/HoursPerEmployee);
     System.out.println("всего работников в компании"+ TotalEmployeesInTheCompany);

     var peaple = 94;
     var lfThereAre94PeopleInTheCommunity=(Watch/peaple);
     System.out.println("Если в компании 94 человек,то всего часов"+lfThereAre94PeopleInTheCommunity);}}