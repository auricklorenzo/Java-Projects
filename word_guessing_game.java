import java.util.Scanner; //import the library needed

import java.util.Random;
public class word_guessing_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // declare variable for the scanner
        Random rand = new Random(); // declare variable for the random
        String[] categories = { "Car Brands", "City", "Country", "Jobs", "Sports"}; //array of categories
        //these are the arrays of word in the categories
        String[] Car_brands = { "Lamborghini", "Ford", "Ferrari", "Tesla", "Toyota"};
        String[] city = { "London", "Paris", "New york city", "Dubai", "Manila"};
        String[] country = { "Japan", "United States", "United Kingdom", "China", "Philippines" };
        String[] job = {"Doctor", "Engineer", "Politician", "Chef", "Celebrity"};
        String[] sports = {"Basketball", "Baseball", "Volleyball", "Archery", "Badminton"};
        int word_rand; //var for the random index
        String word_pick = ""; //var for the random word
        System.out.println("-----------Word Guessing Game!-----------\n");//title
        System.out.print("Hello, What's Your name? "); //ask user the name
        String name = input.nextLine(); //store the name of user
        boolean continueprog = true; //var for the while loop
        while (continueprog) { //looping of the program
            int rand_Categ = rand.nextInt(categories.length); //var for random index in the categories

            System.out.println();
            //if else statement of assigning random value for word_rand and word_pick
            if (categories[rand_Categ].equals("Car Brands")) { //for the categories of car brands
                word_rand = rand.nextInt(Car_brands.length);
                word_pick = Car_brands[word_rand];
            } else if (categories[rand_Categ].equals("City")) { //for the city categories
                word_rand = rand.nextInt(city.length);
                word_pick = city[word_rand];
            } else if (categories[rand_Categ].equals("Country")) { // for the country categories
                word_rand = rand.nextInt(country.length);
                word_pick = country[word_rand];
            } else if (categories[rand_Categ].equals("Jobs")) { // for the job categories
                word_rand = rand.nextInt(job.length);
                word_pick = job[word_rand];
            }else if(categories[rand_Categ].equals("Sports")){ //for the sports categories
                word_rand = rand.nextInt(sports.length);
                word_pick = sports[word_rand];
            }
            //declaring var for the hints
            String hint1 = null;
            String hint2 = null;
            String hint3 = null;
            String hint4 = null;
            //switch statement for assigning the hints if this word is pick
            switch (word_pick) {
                case "Lamborghini": //hints for lamborghini
                    hint1 = "Sport's Car";
                    hint2 = "An Italian brand and manufacturer of luxury sports cars and SUVs based in Sant'Agata Bolognese.";
                    hint3 = "Famous model of this brand is the Murciélago";
                    hint4 = "Founded by Ferruccio Lamborghini";
                    break;
                case "Ford": //hints for ford
                    hint1 = "A Motor Company";
                    hint2 = "An American multinational automaker that has its main headquarters in Dearborn";
                    hint3 = "The World's Fifth Largest based on worldwide vehicle sales";
                    hint4 = "Founded by Henry Ford on June 16, 1903";
                    break;
                case "Ferrari": //hints for ferrari
                    hint1 = "Sport's Car";
                    hint2 = "The logo has a Horse";
                    hint3 = "An Italian luxury sports car manufacturer based in Maranello, Italy.";
                    hint4 = "Founded by Enzo Ferrari";
                    break;
                case "Tesla": //hints for tesla
                    hint1 = "Environment Friendly Car";
                    hint2 = "It requires Electricity to Run";
                    hint3 = "An American electric vehicle and clean energy company based in Palo Alto, California, United States.";
                    hint4 = "Founded by one and only and the Richest man in the World, Elon Musk";
                    break;
                case "Toyota": //hints for toyota
                    hint1 = "A company from Japan";
                    hint2 = "One of the largest automobile manufacturers in the world, producing about 10 million vehicles per year.";
                    hint3 = "Incorporated on August 28, 1937";
                    hint4 = "Founded by Kiichiro Toyoda";
                    break;
                case "London": //hints for london
                    hint1 = "Found in the continent of Europe";
                    hint2 = "The oldest of the world’s great cities, with its history spanning nearly two millennia";
                    hint3 = "Capital of England";
                    hint4 = "This is where you will find the beautiful London bridge";
                    break;
                case "Paris": //hints for paris
                    hint1 = "One of the most visited cities in the world";
                    hint2 = "Found in the continent of europe";
                    hint3 = "Capital of France";
                    hint4 = "Eiffel Tower is in this City";
                    break;
                case "New york city": //hints for new york city
                    hint1 = "The most densely populated major city in the United States";
                    hint2 = "\"Concrete jungle where dreams are made of\" in a Song Empire State of Mind";
                    hint3 = "One of the US cities that is located south of the United States of America";
                    hint4 = "Statue of Liberty is Found in this City";
                    break;
                case "Dubai": //hints for dubai
                    hint1 = "The Shopping Capital of Middle East";
                    hint2 = "4th Largest number of Skyscrapers in the World";
                    hint3 = "Palm Islands: Palm Jumeirah, Deira Island and Palm Jebel Ali";
                    hint4 = "Capital of UAE";
                    break;
                case "Manila": //hints for manila
                    hint1 = "Its the second most populous City";
                    hint2 = "Located in Southeast Asia";
                    hint3 = "Isko Moreno";
                    hint4 = "Capital of Philippines";
                    break;
                case "Japan": //hints for japan
                    hint1 = "50% of the country is mountainous and covered by forests";
                    hint2 = "Land of Anime";
                    hint3 = "Located in East Asia";
                    hint4 = "US drops 2 Nuclear Bomb on them";
                    break;
                case "United States": //hints for US
                    hint1 = "The most Powerful Country";
                    hint2 = "It consists of 50 states, a federal district, five major unincorporated territories, 326 Indian reservations, and some minor possessions.";
                    hint3 = "Located in North America";
                    hint4 = "Commonly known as America";
                    break;
                case "United Kingdom": //hints for UK
                    hint1 = "A Monarchy Government";
                    hint2 = "Group of islands off the northwest coast of Europe.";
                    hint3 = "Queen Elizabeth II";
                    hint4 = "Also called the U.K.";
                    break;
                case "China": //hints for China
                    hint1 = "Kites is invented in this Country";
                    hint2 = "World's Largest Producer of Gold";
                    hint3 = "Located in East Asia";
                    hint4 = "Forbidden City and Great Wall of China";
                    break;
                case "Philippines": //hints for maharlika
                    hint1 = "One of the beautiful Tourist Destination in the World";
                    hint2 = "The text capital of the world";
                    hint3 = "Made up of over 7,100 islands";
                    hint4 = "flag is hoisted upside down when the country is at war";
                    break;
                case "Doctor": //hints for doctor
                    hint1 = "Always Busy";
                    hint2 = "Where white Clothes";
                    hint3 = "They can Open your Stomach";
                    hint4 = "Makes you Healthy";
                    break;
                case "Engineer": //hints for engineer
                    hint1 = "Smart people";
                    hint2 = "Wear's hard hat";
                    hint3 = "Key Player in Building a House";
                    hint4 = "They are good at math";
                    break;
                case "Politician": //hints for politician
                    hint1 = "Some of them are bad Some of them are Good";
                    hint2 = "Lawyers";
                    hint3 = "They Handle the Economy";
                    hint4 = "They are the rulers of a Country";
                    break;
                case "Chef": //hints for chef
                    hint1 = "Eater";
                    hint2 = "Wear White Clothes";
                    hint3 = "They are Healthy";
                    hint4 = "They make delicious Foods";
                    break;
                case "Celebrity": //hints for celebrity
                    hint1 = "Good looking people";
                    hint2 = "Rich";
                    hint3 = "Popular";
                    hint4 = "They are task to portrayed a character";
                    break;
                case "Basketball": //hints for basketball
                    hint1 = "They use a ball";
                    hint2 = "You need to be tall in this sport";
                    hint3 = "Filipinos love this Sport";
                    hint4 = "Michael Jordan";
                    break;
                case "Baseball": //hints for baseball
                    hint1 = "They use a ball";
                    hint2 = "You need to have a fast reaction time";
                    hint3 = "Pitcher";
                    hint4 = "They use a bat";
                    break;
                case "Volleyball": //hints for volleyball
                    hint1 = "They use a ball";
                    hint2 = "They use a net";
                    hint3 = "Anime Haiku";
                    hint4 = "Mostly Women play";
                    break;
                case "Archery": //hints for archery
                    hint1 = "They use a deadly weapon";
                    hint2 = "Sharpshooter";
                    hint3 = "They always aim for the center";
                    hint3 = "Arrow";
                    break;
                case "Badminton": //hints for badminton
                    hint1 = "They use a net";
                    hint2 = "Agility is the key";
                    hint3 = "They use a racquets";
                    hint4 = "It can be played by teams or by individual";
                    break;
            }
            int lives = 9; //var for lives
            //greetings to player and rules of the game
            System.out.println("Alright!, Hello " + name + "!\n");
            System.out.println("The Rules are Simple, I will give you a random Category");
            System.out.println("In those category I will pick a random Word\n");
            System.out.println("You as a player need to Guess what word is it!");
            System.out.println("But Remember you have 5 lives only, once that reaches 0, ITS GAME OVER!!\n");
            System.out.println("So Good luck my Precious Friend!.\n");

            System.out.println("Your Category is " + categories[rand_Categ] + "!\n"); //giving the random categories

            for (int i = 0; i < lives; i++) { //(0,9) (1,8) (2,7) (3,6) (4,5) //for loop for implementing the lives of the player
                System.out.print("Enter you Guess : "); //ask the user their guess
                String guess = input.nextLine(); //store the guess
                System.out.println();
                //if else statement if the guess is equal to the word_pick
                if (guess.equalsIgnoreCase(word_pick)) { //if the guess is correct
                    System.out.println("Nicee!, You have Guess the Word!");
                    break;
                } else if (!guess.equals(word_pick) && lives == 9) { //if the guess is wrong, minus one live, give hint1
                    lives--;
                    System.out.println("Wrong!! Here's a hint for you\n");
                    System.out.println("Hint: " + hint1);
                    System.out.println();
                } else if (!guess.equals(word_pick) && lives == 8) { //if the guess is wrong, minus one live, give hint2
                    lives--;
                    System.out.println("Wrong!! Here's another hint for you\n");
                    System.out.println("Hint: " + hint2);
                    System.out.println();
                } else if (!guess.equals(word_pick) && lives == 7) { //if the guess is wrong, minus one live, give hint3
                    lives--;
                    System.out.println("Wrong!! Here's another hint for you\n");
                    System.out.println("Hint: " + hint3);
                    System.out.println();
                } else if (!guess.equals(word_pick) && lives == 6) { //if the guess is wrong, minus one live, give hint4
                    lives--;
                    System.out.println("Wrong!! Here's the last hint for you\n");
                    System.out.println("Hint: "  + hint4);
                    System.out.println();
                } else if (!guess.equals(word_pick) && lives == 5) { //if the guess is wrong, minus one live, and gameover
                    lives--;
                    System.out.println("Oops!, Sorry Your out of Lives");
                    System.out.println("The Word is " + word_pick); //give the word
                    System.out.println("Game Over!!!\n");
                }
            }
            System.out.print("Play Again?(yes/no) "); //ask the user to play again
            String con = input.nextLine(); //store the yes or no

            if (con.equalsIgnoreCase("yes")) { //if play again the loop continue
                continueprog = true;
            } else if (con.equalsIgnoreCase("No")) { //if not play again the loop will end
                continueprog = false;
            }else {
                System.out.println("Invalid input Start the game Again!"); //if the input is invalid
                break; //the program will end and the user need to run the program again
            }
        }
        System.out.println();
        System.out.println("Thank you for Playing!"); //greetings if they said no
        
    }
}