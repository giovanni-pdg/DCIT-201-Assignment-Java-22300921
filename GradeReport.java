public class GradeReport {

    // High-level method
    public static void executeGradeReport(double score) {

        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        char grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }

    // Helper method 1: validates score
    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    // Helper method 2: calculates letter grade
    public static char calculateLetterGrade(double score) {
        if (score >= 80) return 'A';
        if (score >= 70) return 'B';
        if (score >= 60) return 'C';
        if (score >= 50) return 'D';
        return 'F';
    }

    // Helper method 3: displays feedback
    public static void displayPerformanceMessage(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance");
                break;
            case 'B':
                System.out.println("Very good performance");
                break;
            case 'C':
                System.out.println("Good performance");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
