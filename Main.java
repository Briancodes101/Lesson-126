// Main.java
import java.util.Scanner;

public class Main {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in);
        // We are creating a hiring tool where the HR can register candidates based on eligibility to the database
        // database connection is not done in this program to avoid complexity at this point of time
        // this could be completed using simple if else too but when systems become complex and big using the standard approach becimes the best solution
        System.out.println("Enter the candidate Details ");

        System.out.println("Name");
        String name = scanner.next();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Enter Percentage in 10th");
        int percentage = scanner.nextInt();
        // extra eligibility criteria can also be added
        // 12th mark
        // does skill include Java .......
        if (percentage < 50) {
            throw new InvalidInternException("Registration Failed. Percetage cannot be less than 50%.");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to InterHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registrtion Successful");
            // consider this was an working application over here if reg is successfulwe can save the data to the database.
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}