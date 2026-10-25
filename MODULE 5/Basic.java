public class Main {
    /*
    @Author: Jheric S. Barza
    */
    public static void main(String[] args) {

        String[] favorite = {"Reading", "Coding", "Playing Online Games", "Coffee", "Watching Anime or Movie"};

        System.out.println("====== My Favorite Things ==≈====");
        
    
        for (int i = 0; i < favorite.length; i++) {
            System.out.println((i + 1) + ". " + favorite[i]);
        }

        
        System.out.println("\nTotal number of items: " + favorite.length);
    }
}
