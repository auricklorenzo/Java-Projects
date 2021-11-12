import java.util.Scanner;
public class Item_searcher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String categories[] = { "Chichirya", "Shampoo", "Soap", "School Supplies", "Seasoning", "Biscuits",
                "Vegetables", "Softdrinks" };
        
        String[] Chichirya = { "Vcut     P20", 
                               "Nova     P20", 
                               "Piattos  P15", 
                               "Chippy   P15", 
                               "TaHoos   P1" };

        String[] Shampoo = { "Head&Shoulder  P40", 
                             "Dove           P30", 
                             "Rejoice        P20", 
                             "Palmolive      P20" };
        String[] Soap = { "Safeguard     P20", 
                          "GreenCross    P20", 
                          "Irish Spring  P40", 
                          "Dove          P30" };
        String[] School_Supplies = { "Scissor    P15", 
                                     "Ballpen    P5", 
                                     "Pencil     P5", 
                                     "Bondpaper  P1 x2"};
        String[] Seasoning = { "Sinigang Mix  P10", 
                               "Magic Sarap   P8", 
                               "Pork Savor    P12", 
                               "Knorr Cube    P6" };
        String[] Biscuits = { "Fita        P8",
                              "Hansel      P8", 
                              "Bravo       P7", 
                              "Tiger       P9", 
                              "Rebisco     P8", 
                              "Combi       P8", 
                              "Sky Flakes  P8"};
        String[] Vegetables = { "Luya     P5", 
                                "Bawang   P7", 
                                "Sibuyas  P8", 
                                "Carrot   P10" };
        String[] Softdrinks = { "Coke mismo    P15", 
                                "Coke 1.5L     P55", 
                                "Sprite mismo  P15", 
                                "Sprite 1.5L   P50" };
    
        System.out.println("<---- Sari-Saris Store Item Searcher ---->");
        System.out.println();
        boolean user_continue = true;
        System.out.println("Options: ");
        for (String x : categories) {
            System.out.println(x);

        }
        System.out.println();
        System.out.println("Type Exit to close the program");
        while (user_continue)  {
            System.out.println();
            System.out.print("Search: ");
            String user_chose = input.nextLine();
            System.out.println();
            for (String y : categories) {
                if (y.equalsIgnoreCase(user_chose)) {
                    if (y == "Chichirya") {
                        System.out.println("======================");
                        for (String a : Chichirya) {
                            System.out.println(a);
                        }
                        System.out.println("======================");
                    } else if (y == "Shampoo") {
                        System.out.println("======================");
                        for (String b : Shampoo) {
                            System.out.println(b);
                        }
                        System.out.println("======================");
                    } else if (y == "Soap") {
                        System.out.println("======================");
                        for (String c : Soap) {
                            System.out.println(c);
                        }
                        System.out.println("======================");
                    } else if (y == "School Supplies") {
                        System.out.println("======================");
                        for (String d : School_Supplies) {
                            System.out.println(d);
                        }
                        System.out.println("======================");
                    } else if (y == "Seasoning") {
                        System.out.println("======================");
                        for (String e : Seasoning) {
                            System.out.println(e);
                        }
                        System.out.println("======================");
                    } else if (y == "Biscuits") {
                        System.out.println("======================");
                        for (String f : Biscuits) {
                            System.out.println(f);
                        }
                        System.out.println("======================");
                    } else if (y == "Vegetables") {
                        System.out.println("======================");
                        for (String g : Vegetables) {
                            System.out.println(g);
                        }
                        System.out.println("======================");
                    } else if (y == "Softdrinks") {
                        System.out.println("======================");
                        for (String h : Softdrinks) {
                            System.out.println(h);
                        }
                        System.out.println("======================");
                    }

                } 
            }
            
            if(user_chose.equalsIgnoreCase("exit")){
                user_continue = false;
            }
        }
        
    }
}