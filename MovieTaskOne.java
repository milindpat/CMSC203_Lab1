import java.util.Scanner;

public class MovieTaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();

        System.out.print("Enter the title of the movie: ");
        String title = scanner.nextLine();
        movie.setTitle(title);

        System.out.print("Enter the rating of the movie: ");
        String rating = scanner.nextLine();
        movie.setRating(rating);

        System.out.print("Enter the number of tickets sold for this movie: ");
        int tickets = scanner.nextInt();
        movie.setSoldTickets(tickets);

        System.out.println("\nMovie Details:");
        System.out.println(movie.toString());
    }
}
