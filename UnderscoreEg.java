void main() {
    try {
        int number = Integer.parseInt("not-a-number");
    } catch (Exception _) {  // Using _ for unused exception
        System.out.println("Invalid input provided");
        // No need to reference the exception object
    }
}