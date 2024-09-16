public class File {
    /**
     * Comprueba si es un directorio
     * @param path ruta del directorio a comprobar
     */
    private void eDirectorio(String path)  {
        java.io.File file = new java.io.File(path);
        if (file.isDirectory()) {
            System.out.println("es un directorio");
        }
        else {
            System.out.println("no es un directorio");
        }
    }

    /**
     * Comprueba si es un fichero
     * @param path ruta del directorio a comprobar
     */
    private void eFicheiro(String path)  {
        java.io.File file = new java.io.File(path);
        if (file.isFile()) {
            System.out.println("es un fichero");
        }
        else {
            System.out.println("no es un fichero");
        }
    }
}
