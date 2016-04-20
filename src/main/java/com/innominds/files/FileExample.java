package com.innominds.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileExample {

    public static void main(String[] args) throws IOException {
        final File file = new File("pom.xml");
        System.out.println(file.getAbsolutePath());

        final Path path = Paths.get("", "src", "main", "java", "com", "innominds", "files", "FileExample.java");

        final Path pw = Paths.get("", "src", "main", "java", "com", "innominds", "files", "FileExamples.java");
        System.out.println(path.getParent());
        path.forEach(item -> System.out.println(item));

        final Stream<String> lines = Files.lines(path);
        lines.forEach(item -> System.out.println(item));
        lines.close();

        System.err.println(new String(Files.readAllBytes(path)));

        Files.write(pw, Files.readAllBytes(path));
    }
}
