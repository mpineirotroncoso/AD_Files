
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

    /**
     * Crear directorio, solo debe crearse cuando no exista
     * @param ruta del directorio que se crea
     */
    private void creaDirectorio(String ruta) {
        java.io.File file = new java.io.File(ruta);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Directorio creado");
        }
        else {
            System.out.println("El directorio ya existe");
        }
    }

    /**
     * Crear fichero en una ruta que existe, solo debe crearse cuando no exista
     * @param dirName ruta del directorio
     * @param fileName nombre del fichero
     */
    private void creaFicheiro(String dirName, String fileName) {
        java.io.File file = new java.io.File(dirName, fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Fichero creado");
            } catch (java.io.IOException e) {
                System.out.println("Error al crear el fichero");
            }
        }
        else {
            System.out.println("El fichero ya existe");
        }
    }
    /**
     * comprobar si se tiene acceso de lectura y escritura por separado
     */
    private void modoAcceso(String dirName, String fileName) {
        java.io.File file = new java.io.File(dirName, fileName);
        if (file.canRead()) {
            System.out.println("lectura si");
        }
        else {
            System.out.println("lectura no");
        }
        if (file.canWrite()) {
            System.out.println("escritura si");
        }
        else {
            System.out.println("escritura no");
        }

    }
}
