import java.util.Scanner;

public class MovieTaskTwo {
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
        int soldTickets = scanner.nextInt();
        movie.setSoldTickets(soldTickets);

        System.out.println("\n🎬 Movie Info: " + movie.toString());

        char answer;
        while (true) {
            System.out.print("\nWould you like to enter another movie? (y/n): ");
            answer = scanner.next().charAt(0);
            scanner.nextLine(); // consume newline

            if (Character.toLowerCase(answer) != 'y') {
                System.out.println("👋 Goodbye!");
                break;
            }

            movie = new Movie(); // create a new movie object

            System.out.print("\nEnter the title of the movie: ");
            title = scanner.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the rating of the movie: ");
            rating = scanner.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold: ");
            soldTickets = scanner.nextInt();
            scanner.nextLine(); // consume newline
            movie.setSoldTickets(soldTickets);

            System.out.println("\n🎬 Movie Info: " + movie.toString());
        }

        scanner.close();
    }
}
