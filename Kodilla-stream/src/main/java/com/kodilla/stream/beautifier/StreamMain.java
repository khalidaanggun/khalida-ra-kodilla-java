package com.kodilla.stream.beautifier;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("cilki",(poem -> "ABC"+poem));
        poemBeautifier.beautify("cilki",(poem -> toUpperCase(poem)));
        poemBeautifier.beautify("cilki", poem -> toLowerCase(poem));
        poemBeautifier.beautify("cilki",poem ->poem + "ABC" );
    }
}
