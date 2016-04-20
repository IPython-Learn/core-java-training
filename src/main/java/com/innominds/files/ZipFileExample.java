package com.innominds.files;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * used to list file names in the zipFile
 *
 * @author ThirupathiReddy V
 *
 */
public class ZipFileExample {

    public static void main(String[] args) throws Exception {

        final FileSystem fs = FileSystems.newFileSystem(Paths.get("source.zip"), null);

        Files.walkFileTree(fs.getPath("/"), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
