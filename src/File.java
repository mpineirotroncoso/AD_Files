public class File {
    private void eDirectorio(String path)  {
        java.io.File file = new java.io.File(path);
        if (file.isDirectory()) {
            System.out.println("es un directorio");
        }
        else {
            System.out.println("no es un directorio");
        }
    }
}
