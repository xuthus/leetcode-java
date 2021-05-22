package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.*;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 588,
        title = "Design In-Memory File System",
        url = "https://leetcode.com/problems/design-in-memory-file-system/"
)
public class DesignInMemoryFileSystemSolution {
    static class FileSystem {

        static class FSObject {
        }

        static class Folder extends FSObject {
            SortedMap<String, FSObject> children = new TreeMap<>();
        }

        static class File extends FSObject {
            StringBuilder content = new StringBuilder();
        }

        Folder root = new Folder();

        public FileSystem() {

        }

        public List<String> ls(String path) {
            String[] names = path.split("/");
            int i = 0;
            FSObject object = root;
            String name = "";
            while (i < names.length) {
                if (!names[i].isEmpty()) {
                    name = names[i];
                    if (object instanceof Folder)
                        object = ((Folder) object).children.get(name);
                    else
                        throw new IllegalArgumentException(path);
                }
                i++;
            }
            return object instanceof Folder ? new ArrayList<>(((Folder) object).children.keySet()) : Collections.singletonList(name);
        }

        public void mkdir(String path) {
            String[] names = path.split("/");
            int i = 0;
            FSObject object = root;
            String name;
            while (i < names.length) {
                if (!names[i].isEmpty()) {
                    name = names[i];
                    if (object instanceof Folder)
                        object = ((Folder) object).children.computeIfAbsent(name, n -> new Folder());
                    else
                        throw new IllegalArgumentException(path);
                }
                i++;
            }
        }

        public void addContentToFile(String filePath, String content) {
            String[] names = filePath.split("/");
            int i = 0;
            FSObject object = root;
            String name;
            while (i < names.length - 1) {
                if (!names[i].isEmpty()) {
                    name = names[i];
                    if (object instanceof Folder)
                        object = ((Folder) object).children.get(name);
                    else
                        throw new IllegalArgumentException(filePath);
                }
                i++;
            }
            File file = (File) ((Folder) object).children.computeIfAbsent(names[names.length - 1], n -> new File());
            file.content.append(content);
        }

        public String readContentFromFile(String filePath) {
            String[] names = filePath.split("/");
            int i = 0;
            FSObject object = root;
            String name;
            while (i < names.length - 1) {
                if (!names[i].isEmpty()) {
                    name = names[i];
                    if (object instanceof Folder)
                        object = ((Folder) object).children.get(name);
                    else
                        throw new IllegalArgumentException(filePath);
                }
                i++;
            }
            File file = (File) ((Folder) object).children.get(names[names.length - 1]);
            return file.content.toString();
        }
    }
}
