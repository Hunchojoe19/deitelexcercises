package cddClass;

public class MyersBriggsAnswerSheet {
    static int extrovert = 0;
    static int introvert = 0;
   static  int sensor = 0;
   static int intuition = 0;
   static int thinkers = 0;
   static int feelers = 0;
   static int judgers = 0;
   static int perceivers = 0;
    public static void userIntrovertOrExtrovert(String reply){

    if (reply == "A"){
        extrovert++;}else if (reply == "B"){introvert++;}
    }
    public static void userSensorsOrIntuitors(String reply){
        if (reply == "A"){
            sensor++;}
        else if (reply == "B"){
            intuition++;}

    }
    public static void userThinkersOrFeelers(String reply){
        if (reply == "A"){
            thinkers++;}else if (reply == "B"){feelers++;}
    }
    public static void userJudgersOrPerceivers(String reply){
        if (reply == "A"){ judgers++;

        }else if (reply == "B") {perceivers++;}
    }
    public static void yourPersonalityType(){
        if (extrovert > introvert){
            System.out.println(extrovert);
        } else {
            System.out.println(introvert);
        }
        if (sensor > intuition)
        {
            System.out.println(sensor);
        }else{
            System.out.println(intuition);
        }
        if (thinkers > feelers) {
            System.out.println(thinkers);
        } else {
            System.out.println(feelers);
        }
        if (judgers > perceivers){
            System.out.println(judgers);
        } else {
            System.out.println(perceivers);
        }
    }
}
