// Reverse string by CHARACTERS:

public static void main(String[] args) {
    // Using traditional approach
    String result="";
    for(int i=string.length()-1; i>=0; i--) {
        result = result + string.charAt(i);
    }
    System.out.println(result);

    // Using StringBuffer class
    StringBuffer buffer = new StringBuffer(string);
    System.out.println(buffer.reverse());    
}
// Reverse string by WORDS:

public static void reverseStringByWords(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] words = string.split(" ");

    for (int j = words.length-1; j >= 0; j--) {
        stringBuilder.append(words[j]).append(' ');
    }
    System.out.println("Reverse words: " + stringBuilder);
}