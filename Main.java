import module java.base;

void main() {
    // All java.base module classes are now available
    List<String> items = List.of("Java", "25", "Released");
    items.forEach(System.out::println);
}