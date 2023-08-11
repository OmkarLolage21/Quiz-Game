package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    public QuestionsBank() {
    }

    private static List<QuestionsList> SportsQuestions(){
        final List<QuestionsList> questionsLists= new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Rishabh Pant got India to win in 4th innings og which test match series ?","Ashes","Paytm Trophy","Border-Gavaskar Trophy","Australia trophy","Border-Gavaskar Trophy");
        final QuestionsList question2 = new QuestionsList("Who scored an double century against NZ in first Paytm ODI 2023 ?","Rohit Sharma","Virat","Shubhman Gill","Suryakumar Yadav","Shubhman Gill");
        final QuestionsList question3 = new QuestionsList( "In which country's FIH Men’s Hockey World Cup did the team enter the quarterfinals by beating India in a penalty shoot-out?","New Zealand","Norway","Nepal","Nigeria","New Zealand");
        final QuestionsList question4 = new QuestionsList("How many teams were announced for the first season of the Women's premier League ?","3","5","4","6","5");
        final QuestionsList question5 = new QuestionsList("Who was named ICC T20 Cricketer of the Year?","Dinesh Karthik","Yuzvendra Chahal","Suryakumar Yadav","Shreyas Iyer","Suryakumar Yadav");
        final QuestionsList question6 = new QuestionsList("Who has been selected as the ICC Men's Cricketer of the Year 2022?","MS Dhoni","Babar Azam","Joe root","Ravichandran Ashwin","Babar Azam");
        final QuestionsList question7 = new QuestionsList("In the 2023 Hockey World Cup, which team registered the biggest win in Hockey World Cup history?","Australia","Canada","Netherlands","India","Netherlands");
        final QuestionsList question8 = new QuestionsList("Who broke MS Dhoni's record of most sixes in ODIs in India?","KL Rahul","Hardik Pandya","Rohit Sharma","Shubman Gill","Rohit Sharma");
        final QuestionsList question9 = new QuestionsList("Who was chosen as the best player for 2022 by International Football Federation History and Statistics (IFFHS)?","Emiliano Martinez","Angel Di Maria","Lautaro Matinez","Lionel Messi","Lionel Messi");
        final QuestionsList question10 = new QuestionsList("Anshu Malik won silver at Individual Wrestling World Cup in which country ?","Sudan","Serbia","Syria","Sri Lanka","Serbia");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }
    private static List<QuestionsList> MathsQuestions(){
        final List<QuestionsList> questionsLists= new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(" How many Zeros are there in One Billion?","7","8","9","10","9");
        final QuestionsList question2 = new QuestionsList("Which of the following is the smallest 3 digits number exactly divisible by 6, 8 and 12 ?","120","240","180","360","120");
        final QuestionsList question3 = new QuestionsList("Write the next number of the following Sequences 1, 1, 2, 3, 5, 8, 13, _?","20","21","22","23","21");
        final QuestionsList question4 = new QuestionsList("Select Indian Mathematician","Isaac Newton","PYTHAGORAS","Srinivasa Ramanujuna","Euler","Srinivasa Ramanujuna");
        final QuestionsList question5 = new QuestionsList("The average of first 50 natural numbers is ?","25.30","25.5","25.00"," 12.25","25.5");
        final QuestionsList question6 = new QuestionsList("Which of the following numbers gives 240 when added to its own square?","15","16","18","20","15");
        final QuestionsList question7 = new QuestionsList("How many sides are there in a Heptagon?","7","8","9","10","7");
        final QuestionsList question8 = new QuestionsList("The value of Pi ?","3.14159","3.15463","3.14624","None of the above","3.14159");
        final QuestionsList question9 = new QuestionsList(" If 3 4 * 6 8 is to be divisible by 9, then the value of missing digit, * should be ?","6","5","4","3","6");
        final QuestionsList question10 = new QuestionsList("How many diagonals are there in a quadrilateral ?","2","3","4","None of the above","2");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }
    private static List<QuestionsList> SciTechQuestions(){
        final List<QuestionsList> questionsLists= new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is Newton's Third Law?","Momentum law","action-reaction","relativity","None of these","action-reaction");
        final QuestionsList question2 = new QuestionsList("Who proposed theory of relativity ?","Isaac Newton","Einstein","Kepler","Stephen Hawking","Einstein");
        questionsLists.add(question1);
        questionsLists.add(question2);

        return questionsLists;
    }
    private static List<QuestionsList> CartoonQuestions(){
        final List<QuestionsList> questionsLists= new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What Popeye the sailor man famously eats to increase his strength?","Ladoo","Spinach","Chocolate","Carrot","Spinach");
        final QuestionsList question2 = new QuestionsList("Which of these characters likes to sing but has a very bad voice?","Suneo","Gian","Shizuka","Doraemon","Gian");
        final QuestionsList question3 = new QuestionsList("What's the last name of Kenichi?","Kun","Chan","Lee","Mitsuba","Mitsuba");
        final QuestionsList question4 = new QuestionsList("What is the name of the villain in “The Lion King”","Simba","Mustafa","Scar","None of the above","Scar");
        final QuestionsList question5 = new QuestionsList("What is the name of the first feature film Disney released in 1937?","Beauty and the Beast","Snow White and the Seven Dwarfs","Cinderella","Lady and the Tramp","Snow White and the Seven Dwarfs");
        final QuestionsList question6 = new QuestionsList("In Roll No 21, which are two enemies of Kris?","Pinky and Bablu","Madhu and Prasanth","Gollu and Kanisk"," None of the above","Gollu and Kanisk");
        final QuestionsList question7 = new QuestionsList(" What is another name of the Mickey Mouse?","Mortimer Mouse","Melvin Mouse","Marty Mouse","None of the above","Mortimer Mouse");
        final QuestionsList question8 = new QuestionsList(" What is Oggy's hobby?","Watching T.V.","Reading the newspaper","Fighting with Cockroaches","Playing Cricket","Watching T.V.");
        final QuestionsList question9 = new QuestionsList("In Chota Bheem, the character Raju has how many hairs on his head?","2","4","3","5","2");
        final QuestionsList question10 = new QuestionsList("Who is the most intelligent student in Nobita's class ?","nobita","Gian","Shizuka","Dekisugi","Dekisugi");
        final QuestionsList question11 = new QuestionsList("What does Motu love to eat?","Chai","Kachori","Samosa","Ladoo","Samosa");
        final QuestionsList question12 = new QuestionsList(" What is the name of Princess of Dholakpur ?","Chutki","Indumati","Bhanumati","inadamati","Indumati");
        final QuestionsList question13 = new QuestionsList("What is the name of chhota bheem's sister?","sakshi","shivani","chutki","marani","shivani");
        final QuestionsList question14 = new QuestionsList("Who is intelligent frined of shinchan ?","Masav","Bohchan","Kazama","Manny","Kazama");
        final QuestionsList question15 = new QuestionsList("Select correct pair of shinchan's dog name and its meaning","shiro-white","shiro-black","kuro-white","kuro-black","shiro-white");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Sports" : return SportsQuestions();
            case "Maths" : return MathsQuestions();
            case "Scitech" : return SciTechQuestions();
            default: return CartoonQuestions();
        }
    }
}
