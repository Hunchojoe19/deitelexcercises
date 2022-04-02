package cddClass;

import java.util.Scanner;

public class MyersBriggs {

    public static void main (String... args) {
        //serve questions
        // collect users' response
        // return users input based on his own traits
        Scanner user = new Scanner(System.in);
        String answer;
        System.out.println("Welcome to the Myers Briggs Questionnaire");
//        for(int count = 1; count <= 20; count++)
        System.out.println("""
                        Please pick from options A and B
                        
                        
                        1.
                        A. Expend energy, enjoy groups
                        B. Conserve energy, enjoy one-on-one""");
       answer = user.nextLine().toUpperCase();
       MyersBriggsAnswerSheet.userIntrovertOrExtrovert(answer);
        System.out.println("""
                2.
                A. Interpret literally
                B. Look for meaning and possibilities""");
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userSensorsOrIntuitors(answer);
        System.out.println("""
                3.
                A. Logical, thinking, questioning
                B. Empathetic, feeling, accommodating""");
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userThinkersOrFeelers(answer);
        System.out.println("""
                4.
                A. Organized, orderly
                B. Flexible, adaptable""");
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userJudgersOrPerceivers(answer);
        System.out.println("""
                5.
                A. More outgoing, think out loud
                B. More reserved, think to yourself""");
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userIntrovertOrExtrovert(answer);
        System.out.println("""
                6.
                A. Practical, realistic, experiential
                B. Imaginative, innovative, theoretical
                """);
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userSensorsOrIntuitors(answer);
        System.out.println("""
                7.
                A. Candid, straightforward, frank
                B. Tactful, kind, encouraging""");
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userThinkersOrFeelers(answer);
        System.out.println("""
                8.
                A. Plan, schedule
                B. Unplanned, spontaneous""");
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userJudgersOrPerceivers(answer);
        System.out.println("""
                9.
                A.Seeks many tasks, public activities, interaction with others
                B. Seek private, solitary activities with quiet to concentrate""");
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userIntrovertOrExtrovert(answer);
        System.out.println("""
                10.
                A. Standard, usual, conventional
                B. Different, novel, unique
                """);
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userSensorsOrIntuitors(answer);
        System.out.println("""
                11.
                A. Firm,tend to criticize, hold the line
                B. Gentle, tend to appreciate, conciliate""");
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userThinkersOrFeelers(answer);
        System.out.println("""
                12.
                A. Regulated, structured
                B. Easygoing, "live" and "let live"
                """);
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userJudgersOrPerceivers(answer);
        System.out.println("""
                13.
                A. External, communicative, express yourself
                B. Internal, reticent, keep to yourself""");
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userIntrovertOrExtrovert(answer);
        System.out.println("""
                14.
                A. Focus on here-and -now
                B. Look to the future, global perspective, "big picture"
                """);
        answer = user.nextLine().toUpperCase();
        MyersBriggsAnswerSheet.userSensorsOrIntuitors(answer);
        System.out.println("""
                15.
                A. Tough-minded, just
                B. Tender-hearted, merciful""");
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userThinkersOrFeelers(answer);
        System.out.println("""
                16.
                A. Preparation, plan ahead
                B. Go with the flow, adapt as you go
                """);
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userJudgersOrPerceivers(answer);
        System.out.println("""
                17.
                A. Active, initiate
                B. Reflective, deliberate
                """);
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userIntrovertOrExtrovert(answer);
        System.out.println("""
                18.
                A. Facts, things, "what is"
                B. Ideas, dreams, "what could be, philosophical" 
                """);
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userSensorsOrIntuitors(answer);
        System.out.println("""
                19.
                A. Matter of fact, issue-oriented
                B. Sensitive, people-oriented, compassionate""");
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userThinkersOrFeelers(answer);
        System.out.println("""
                20.
                A. Control, govern
                B. Latitude, freedom""");
        answer.equals(user.nextLine().toUpperCase());
        MyersBriggsAnswerSheet.userJudgersOrPerceivers(answer);

        MyersBriggsAnswerSheet.yourPersonalityType();

    }
            }

