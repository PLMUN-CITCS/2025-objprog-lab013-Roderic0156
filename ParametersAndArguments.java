public class ParametersAndArguments {

    // Method to calculate area
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;
        int area = calculateArea(roomWidth, roomHeight);
        System.out.println("The calculated area is: " + area);
    }
}

