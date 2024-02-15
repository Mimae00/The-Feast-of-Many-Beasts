package src;

public class FeastBeastsImpl {

    public static void feast(String beast, String dish) {

        String firstLetterBeast = String.valueOf(beast.charAt(0));
        String firstLetterDish = String.valueOf(dish.charAt(0));
        String lastLetterBeast = String.valueOf(beast.charAt(beast.length()-1));
        String lastLetterDish = String.valueOf(dish.charAt(dish.length()-1));

        if(firstLetterBeast.equals(firstLetterDish) && lastLetterBeast.equals(lastLetterDish)){
            System.out.println("Same First and Last letter!");
        } else {
            System.out.println("Not Same First and Last letter!");
        }
    }
}
