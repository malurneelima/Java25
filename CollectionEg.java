void main() {
    List<String> languages = List.of("Java", "Python", "JavaScript", "Go");
    
    // New convenient methods
    System.out.println("First: " + languages.getFirst());
    System.out.println("Last: " + languages.getLast());
    
    // Reverse the entire list
    List<String> reversed = languages.reversed();
    System.out.println("Reversed: " + reversed);
}